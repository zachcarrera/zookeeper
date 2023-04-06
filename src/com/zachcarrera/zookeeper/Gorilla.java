package com.zachcarrera.zookeeper;

public class Gorilla extends Mammal {

	// constructors
	public Gorilla() {
		super();
	}

	// Gorilla specific methods
	public Gorilla throwSomething() {
		System.out.println("The Gorilla is throwing something!");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
		return this;
	}

	public Gorilla eatBananas() {
		System.out.println("This Gorilla loves bananas!");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
		return this;
	}

	public Gorilla climb() {
		System.out.println("The Gorilla climbed to the top of the tree!");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
		return this;
	}
}
