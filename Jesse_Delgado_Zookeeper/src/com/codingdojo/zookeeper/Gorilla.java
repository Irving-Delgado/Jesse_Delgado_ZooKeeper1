package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		energyLevel -=5;
		System.out.println("The gorilla had thrown something, energy level -5, your energy level is now, "+energyLevel);
	}
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("The gorilla had ate a banana, energy level +10, your energy level is now, "+energyLevel);
	}
	public void climb(){
		energyLevel += 10;
		System.out.println("The gorilla had started to climb, energy level -10, your energy level is now, "+energyLevel);
	}

}
