package com.christianjaena.kingdomwars.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Army {
    private int archer;
    private int infantry;
    private int cavalry;

    public Army() {
        this.archer = 0;
        this.infantry = 0;
        this.cavalry = 0;
    }

    public int getPower() {
        return archer + infantry + cavalry;
    }

}
