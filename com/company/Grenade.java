package com.company;

public class Grenade extends GunDecorator {
	
 
	public Grenade(Soldier pizza) {
		this.soldier = pizza;
	}
 
	public String getDescription() {
		return soldier.getDescription() + ", Grenade";
	}
 
	public int number_of_guns() {
		return soldier.number_of_guns(); // grenade doesn't take up space
	}
}
