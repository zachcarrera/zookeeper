package com.zachcarrera.zookeeper;

public class Mammal {

	private int energyLevel;
	
	// constructors
	public Mammal() {
		this.energyLevel = 100;
	}


	public void displayEnergy() {
		System.out.println("The current energy level is " + this.energyLevel);
	}


	// getters and setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

}
