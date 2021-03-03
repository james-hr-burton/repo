package io.github.oliviercailloux.samples.coffee;

/**
 * <p>
 * A <a href=
 * "https://www.startpage.com/sp/search?query=drip+coffee+maker&cat=pics">drip
 * coffee maker</a>. It uses a specific brand of coffee, which makes it able to
 * produce coffee of any strength from 0 to 10. It takes a constant time of 2
 * minutes to produce coffee (of strength higher than zero). Unrealistically, we
 * suppose here that it produces only one coffee at a time.
 * </p>
 * <p>
 * The energy required for producing a coffee (of strength higher than zero) is
 * an estimated 83 <a href="https://en.wikipedia.org/wiki/Watt_hour">watt
 * hours</a>.
 * </p>
 */
public class DripCoffeeMaker implements CoffeeMachine {
	private int numberOfCoffeeProduced;
	private double strengthOfTheLastCoffee;

	public DripCoffeeMaker() {
		this.numberOfCoffeeProduced = 0;
		this.strengthOfTheLastCoffee = -1;
	}

	@Override
	public double getMaxStrength() {

		return 10;
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
			return 120;

	}

	@Override
	public void produceCoffee(double strength) {
		if (strength < 0 || strength > this.getMaxStrength()) {
			throw new IllegalArgumentException(
					"strength must be a non-negative value, at most : " + this.getMaxStrength());
		}

		this.numberOfCoffeeProduced++;
		this.strengthOfTheLastCoffee = strength;

	}

	@Override
	public int getNumberOfCoffeesProduced() {
		return this.numberOfCoffeeProduced;
	}

	@Override
	public double getEnergySpent() throws IllegalStateException {
		if (this.strengthOfTheLastCoffee == -1) {
			throw new IllegalStateException("this machine has never produced coffee.");
		}
		if (strengthOfTheLastCoffee == 0) {
			return 0;
		}

		return 83;

	}

}
