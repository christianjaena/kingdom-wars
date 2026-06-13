package com.christianjaena.kingdomwars.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class KingdomTest {

    private Kingdom kingdom;

    @BeforeEach
    void setup() {
        this.kingdom = new Kingdom("Kingdom");
    }

    @Test
    void kingdomNameShouldBeSet() {
        assertNotNull(kingdom.getName());
    }

    @Test
    void goldShouldStartAtZero() {
        assertEquals(0, kingdom.getGold());
    }

    @Test
    void armyShouldNotBeEmpty() {
        assertNotNull(kingdom.getArmy());
    }

}
