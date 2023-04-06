package com.zachcarrera.zookeeper;

public class Bat extends Mammal {

	// constructors
	public Bat() {
		super();
		this.setEnergyLevel(300);
	}
	
	
	// Bat specific methods
	public Bat fly() {
		System.out.println("WOOSHH");
		this.setEnergyLevel(getEnergyLevel() - 50);
		return this;
	}

	public Bat eatHumans() {
		System.out.println("CRUNCH");
		this.setEnergyLevel(getEnergyLevel() + 25);
		return this;
	}
	
	public Bat attackTown() {
		System.out.println("FIREEEE");
		this.setEnergyLevel(getEnergyLevel() - 100);
		return this;
	}

}
