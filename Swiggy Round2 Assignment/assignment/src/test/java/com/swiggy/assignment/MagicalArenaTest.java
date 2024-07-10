package com.swiggy.assignment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MagicalArenaTest {

    @Test
    public void testFight() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.fight();

        // Assert that after the fight, at least one player should be dead
        assertFalse("Both players are still alive after the fight!", playerA.isAlive() && playerB.isAlive());
    }

    @Test
    public void testFightEqualStrength() {
        Player playerA = new Player(100, 10, 10);
        Player playerB = new Player(100, 10, 10);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.fight();

        // Assert that after the fight, at least one player should be dead
        assertFalse("Both players are still alive after the fight!", playerA.isAlive() && playerB.isAlive());
    }

    @Test
    public void testFightHigherHealth() {
        Player playerA = new Player(200, 10, 5);
        Player playerB = new Player(100, 10, 5);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.fight();

        // Assert that after the fight, at least one player should be dead
        assertFalse("Both players are still alive after the fight!", playerA.isAlive() && playerB.isAlive());
    }

    @Test
    public void testFightNoDamage() {
        Player playerA = new Player(50, 0, 10);
        Player playerB = new Player(50, 0, 10);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.fight();

        // Assert that after the fight, both players are still alive (no damage dealt)
        assertTrue("One or both players are dead after the fight!", playerA.isAlive() && playerB.isAlive());
    }

    @Test
    public void testFightZeroHealth() {
        Player playerA = new Player(0, 10, 10);
        Player playerB = new Player(0, 10, 10);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.fight();

        // Assert that after the fight, both players are dead (start with zero health)
        assertFalse("One or both players are still alive after the fight!", playerA.isAlive() || playerB.isAlive());
    }
}
