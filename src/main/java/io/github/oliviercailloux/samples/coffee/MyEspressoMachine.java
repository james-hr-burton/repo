package io.github.oliviercailloux.samples.coffee;

/**
 * A specific espresso machine, that produces coffee of strength up to 20, whose
 * power is 2000 watts, and that produces a coffee of strength <em>s</em> in
 * <em>140 + 2 * s</em> seconds.
 *
 */
public class MyEspressoMachine implements EspressoMachine {

	private int numberOfCoffeeProduced;
	private int timeForTheLastCoffee;
	private double strengthOfTheLastCoffee;

	public MyEspressoMachine() {
		this.numberOfCoffeeProduced = 0;
		this.timeForTheLastCoffee = -1;
		this.strengthOfTheLastCoffee = -1;

	}

	@Override
	public double getMaxStrength() {

		return 20;
	}

	@Override
	public int getTimeForCoffee(double strength) {
		if (strength < 0 || strength > this.getMaxStrength()) {
			throw new IllegalArgumentException(
					"strength must be a non-negative value, at most : " + this.getMaxStrength());
		}

		else if (strength == 0) {
			return 0;
		}

		else
			return (int) (140 + (2 * strength));

	}

	@Override
	public void produceCoffee(double strength) {
		if (strength < 0 || strength > this.getMaxStrength()) {
			throw new IllegalArgumentException(
					"strength must be a non-negative value, at most : " + this.getMaxStrength());
		}

		this.numberOfCoffeeProduced++;
		this.strengthOfTheLastCoffee = strength;
		this.timeForTheLastCoffee = this.getTimeForCoffee(strength);

	}

	@Override
	public int getNumberOfCoffeesProduced() {
		return this.numberOfCoffeeProduced;
	}

	@Override
	public double getPower() {

		return 2000;
	}

	@Override
	public double getEnergySpent() throws IllegalStateException {
		if (this.strengthOfTheLastCoffee == -1) {
			throw new IllegalStateException("this machine has never produced coffee.");
		}
		if (strengthOfTheLastCoffee == 0) {
			return 0;
		}

		int timeInHoursToProduceTheLastCoffee;
		timeInHoursToProduceTheLastCoffee = this.timeForTheLastCoffee / 60;

		return ((2000 * timeInHoursToProduceTheLastCoffee) + 15);
	}

}
