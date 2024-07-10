package com.swiggy.assignment;

import java.util.Random;

class Player {
    int health;
    int strength;
    int attack;
    Random random;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }

    int rollDie() {
        return random.nextInt(6) + 1;
    }

    int attack() {
        return rollDie();
    }

    int defend() {
        return rollDie();
    }

    void reduceHealth(int damage) {
        health -= damage;
    }

    boolean isAlive() {
        return health > 0;
    }
}

class MagicalArena {
    Player playerA;
    Player playerB;

    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    void fight() {
        Player attacker = playerA.health < playerB.health ? playerA : playerB;
        Player defender = attacker == playerA ? playerB : playerA;

        while (playerA.isAlive() && playerB.isAlive()) {
            int damage = calculateDamage(attacker, defender);
            if (damage > 0) {
                defender.reduceHealth(damage);
                System.out.printf("%s attacks %s for %d damage!%n", getPlayerName(attacker), getPlayerName(defender), damage);
            } else {
                System.out.printf("%s's attack on %s was defended!%n", getPlayerName(attacker), getPlayerName(defender));
            }

            // Swap roles for the next round
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        announceWinner();
    }

    int calculateDamage(Player attacker, Player defender) {
        int attackRoll = attacker.attack();
        int defenseRoll = defender.defend();
        return attackRoll * attacker.attack - defenseRoll * defender.strength;
    }

    String getPlayerName(Player player) {
        return player == playerA ? "Player A" : "Player B";
    }

    void announceWinner() {
        if (playerA.isAlive()) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.fight();
    }
}
