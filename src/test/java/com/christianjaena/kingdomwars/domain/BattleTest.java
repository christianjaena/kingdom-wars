package com.christianjaena.kingdomwars.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.util.AssertionErrors.assertTrue;

class BattleTest {

    private Battle battle;

    @BeforeEach
    void setUp() {
        this.battle = new Battle();
        battle.setAttacker(new Kingdom("Attacker"));
        battle.setDefender(new Kingdom("Defender"));
    }

    @Test
    void eachKingdomShouldHavePowerOverZero() {
        battle.getAttacker().getArmy().setInfantry(1);
        battle.getDefender().getArmy().setInfantry(1);
        assertTrue("Attacker power is greater than zero", battle.getAttacker().getArmy().getPower() > 0);
        assertTrue("Defender power is greater than zero", battle.getDefender().getArmy().getPower() > 0);
    }

    @Test
    void attackerShouldWin() {
        battle.getAttacker().getArmy().setInfantry(10);
        battle.getDefender().getArmy().setInfantry(1);
        assertEquals("Attacker", this.battle.getWinner().getName());

    }

    @Test
    void shouldReturnNullWhenTie() {
        battle.getAttacker().getArmy().setInfantry(1);
        battle.getDefender().getArmy().setInfantry(1);
        assertEquals(null, this.battle.getWinner());
    }
}
