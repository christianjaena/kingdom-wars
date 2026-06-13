package com.christianjaena.kingdomwars.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArmyTest {

    private Army army;

    @BeforeEach
    void setUp() {
        army = new Army();
    }

    @Test
    void shouldStartWithZeroPower() {
        assertEquals(0, army.getPower());
    }

}