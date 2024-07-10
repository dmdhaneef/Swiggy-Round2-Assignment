package com.swiggy.assignment;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class PlayerTest {
    
    @Test
    public void testAttack() {
        Player player = new Player(50, 5, 10);
        int attackRoll = player.attack();
        assertTrue("Attack roll should be between 1 and 6", attackRoll >= 1 && attackRoll <= 6);  
    }
    
    @Test
    public void testDefend() {
        Player player = new Player(100, 5, 10);
        int defenseRoll = player.defend();
        assertTrue("Defense roll should be between 1 and 6", defenseRoll >= 1 && defenseRoll <= 6);
    }

    @Test
    public void testReduceHealth() {
        Player player = new Player(100, 5, 10);
        player.reduceHealth(20);
        assertEquals("Player's health should be reduced by 20", 80, player.health);
    }

    @Test
    public void testIsAlive() {
        Player player = new Player(50, 5, 10);
        assertTrue("Player should be alive", player.isAlive());
        player.reduceHealth(50);
        assertFalse("Player should be dead", player.isAlive());
    }
}
