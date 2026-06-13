package com.christianjaena.kingdomwars.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Battle {
    private Kingdom attacker;
    private Kingdom defender;

    public Kingdom getWinner() {
        int attackerPower = this.attacker.getArmy().getPower();
        int defenderPower = this.defender.getArmy().getPower();
        if (attackerPower == defenderPower) {
            return null; // It's a tie
        }
        return attackerPower > defenderPower ? this.attacker : this.defender;
    }
}
