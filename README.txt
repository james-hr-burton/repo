= Assisted-Board-Games
:gitHubUserName: oliviercailloux
:groupId: io.github.{gitHubUserName}
:artifactId: assisted-board-games
:repository: Assisted-Board-Games

image:https://travis-ci.com/{gitHubUserName}/{repository}.svg?branch=master["Build Status", link="https://travis-ci.com/{gitHubUserName}/{repository}"]

A Java project developed by students during the https://github.com/oliviercailloux/java-course[Java course] taught at Université Paris-Dauphine (in http://www.mido.dauphine.fr/[MIDO] L3 and M2 MIAGE).

The code is hereby published under the MIT License, with their permission.

Project maintained by :
Dahuiss AMOUSSOU, Marina ATANGANA, James BURTON, Aaron DEMAY, Yasmine HAMNACHE, Kerim HUDAYBERDIYEV, Anam SHAIKH YUNUS+
L3 MIAGE in Apprenticeship

== *Project description*
In this project, the concept of the Assited Board will be implemented. The latter represents a game board as well as an interactive tablet for each player. 

For this project, we will make maximum use of existing libraries and good practices.
Development in iterations.

== *Description for iteration #1 - Project leader: Atangana Marina*

- Focus : Creation of Menu => Task 1: Creation of a class diagram of the Assisted Board Games menu. The objective of this task is to represent the different functions that will allow the user to access the different games. => Amoussou Dahuiss and Burton James

- Focus : Complete the documentation => Task 2: Creation of a Play Board Games Use Case Diagram and Game Entity Class => Hamnache Yasmine and Demay Aaron

- Focus : Complete daughter classes =>  Task 3 : Creation of the daughter classes of chess and draughts that inherit the GameEntity class => Hudayberdiyev Kerim and Shaikh Yunus Anam

=== *List of PR*

- #T_Menu: Amoussou Dahuiss and Burton James
- #Generalization, Inheritance and Reusabily: Hudayberdiyev Kerim and Shaikh Yunus Anam
- #Movesuggestion: Hamnache Yasmine and Demay Aaron

== *Description for iteration #2 - Project leader: James BURTON*


=== *Aaron DEMAY & Dahuiss AMOUSSOU, Task: Creation of Clock Class*


Create a diagram for managing the clock which will be useful for both chess and checkers, the aim is to measure how long a game takes from start to finish and also to add a time constraint.

First, a player sets a time limit that he must respect (10 minutes for each player, for example), with idleness included. Otherwise, he will automatically lose the game.

This tries to solve the problems of long games and player idleness (this prevents an opponent from waiting too long).

We will be using two types of diagrams, a class diagram and sequence diagram.

=== *Anam SHAIKH YUNUS & Yasmine HAMNACHE, Task: Improvement of generalization*

Goals:

1. Have 2 interfaces: *Move* and *Board* with implementations for both games (for chess and checkers)
2. Replace list with multiplicity
3. To first focus on improving the chess game (for the next iteration), and later on work on the checkers game

This task solves the following problem: our application will be able to manage multiple types of games (at least two, chess and checkers). Because these game are different, each needs specific classes (see https://github.com/oliviercailloux-org/projet-assisted-board-games-1/pull/2).


=== *Kerim HUDAYBERDIYEV & Marina ATANGANA, Task: Possible moves during a game of checkers and chess*



Goal: Create a class containing all possible moves

What we will do:

1. Create a parent class diagram containing all moves that are common to both chess and checkers
2. Create a child class containing all possible moves for a checkers game
3. Create a child class containing all possible moves for a chess game
