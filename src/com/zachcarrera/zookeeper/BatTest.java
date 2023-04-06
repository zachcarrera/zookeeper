package com.zachcarrera.zookeeper;

public class BatTest {

	public static void main(String[] args) {
		// instantiate a Bat object
		Bat bat1 = new Bat();
		
		// test bat methods
		bat1.attackTown().attackTown().attackTown();
		bat1.eatHumans().eatHumans();
		bat1.fly().fly();
		bat1.displayEnergy();

	}

}
