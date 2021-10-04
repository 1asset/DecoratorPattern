package com.company;

public class Army {
 
	public static void main(String args[]) {
		Soldier sniper = new Sniper();
		Soldier infantry = new Infantry();
		Soldier Private = new Sniper_rifle(sniper);
		Soldier Private_w_grenade = new Grenade(Private);
		Soldier Officer = new Rifle(infantry);

		System.out.println(Private.getDescription()
				+ " guns: " + Private.number_of_guns());

		System.out.println(Officer.getDescription()
				+ " guns: " + Officer.number_of_guns());

		System.out.println(Private_w_grenade.getDescription()
				+ " guns: " + Private_w_grenade.number_of_guns());

	}
}
