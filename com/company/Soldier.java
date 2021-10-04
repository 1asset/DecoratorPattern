package com.company;

public abstract class Soldier {
	String description = "Soldier from the Army";
  
	public String getDescription() {
		return description;
	}
 
	public abstract int number_of_guns();
}
