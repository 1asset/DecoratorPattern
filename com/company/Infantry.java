package com.company;

public class Infantry extends Soldier {
  
	public Infantry() {
		description = "Soldier from Infantry, with a pistol";
	}
  
	public int number_of_guns() {
		return 1;
	}
}

