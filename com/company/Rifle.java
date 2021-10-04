package com.company;

public class Rifle extends GunDecorator {
	
 
	public Rifle(Soldier soldier) {
		this.soldier = soldier;
	}
 
	public String getDescription() {
		return soldier.getDescription() + ", Rifle";
	}
 
	public int number_of_guns() {
		return soldier.number_of_guns() + 1;
	}
}
