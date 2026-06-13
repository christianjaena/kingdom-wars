package com.christianjaena.kingdomwars.domain;

import lombok.Getter;

@Getter
public class Kingdom {

    private String name;
    private int gold;
    private Army army;

    public Kingdom(String name) {
        this.name = name;
        this.gold = 0;
        this.army = new Army();
    }

}
