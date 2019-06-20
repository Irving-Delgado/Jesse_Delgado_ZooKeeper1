package com.codingdojo.zookeeper;

public class Mammal{
	public int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("Your energy level is at, "+energyLevel);
		return energyLevel;
	}
}
