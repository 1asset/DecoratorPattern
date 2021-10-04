package com.company;

public class Sniper_rifle extends GunDecorator {

    public Sniper_rifle(Soldier soldier) {
        this.soldier = soldier;
    }

    public String getDescription() {
        return soldier.getDescription() + ", Sniper rifle";
    }

    public int number_of_guns() {
        return soldier.number_of_guns() + 1;
    }
}
