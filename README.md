# Magical Arena

This is a simple Java implementation of the Magical Arena game.

## Introduction

The Magical Arena is a turn-based battle game where two players engage in combat until one of them loses all their health points.

## Features

- Players have attributes such as health, strength, and attack.
- Players take turns attacking and defending using dice rolls.
- Damage calculation is based on attack and defense rolls.
- The game ends when one player's health reaches 0.

## Requirements

- Java Development Kit (JDK)
- Eclipse IDE
- JUnit 4

## Project Structure

- **src/main/java/Main.java**: Contains the main source code file.
- **src/test/java/PlayerTest.java**: Contains the test code for the Player class.
- **src/test/java/MagicalArenaTest.java**: Contains the test code for the Magical Arena game.
- **pom.xml**: Maven project configuration file.

## How to Build and Run

### Import the Project into Eclipse

1. Open Eclipse IDE.
2. Select `File` -> `Import` -> `Existing Maven Projects`.
3. Browse to the project directory and select it.
4. Click `Finish`.

### Run the Game

1. Locate `Main.java` in the `src/main/java` directory.
2. Right-click on `Main.java` and select `Run As` -> `Java Application` to start the game.

## How to Play

1. Two players are created with initial attributes (health, strength, and attack).
2. Players take turns attacking and defending.
3. Each player rolls a 6-sided die for attack and defense.
4. Damage is calculated based on the dice rolls and player attributes.
5. The game continues until one player's health reaches 0.

## Unit Tests

Unit tests are provided to ensure the correctness of the code. JUnit 4 and Hamcrest libraries are used for testing.

### Running Unit Tests

1. Right-click on the test class (`PlayerTest.java` or `MagicalArenaTest.java`).
2. Select `Run As` -> `JUnit Test`.
3. View the test results.
