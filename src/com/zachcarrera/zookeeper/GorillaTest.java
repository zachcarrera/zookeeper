package com.zachcarrera.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {

		// instantiate a Gorilla object
		Gorilla gorilla1 = new Gorilla();
		
		// test Gorilla methods
		gorilla1.throwSomething().throwSomething().throwSomething();
		gorilla1.eatBananas().eatBananas();
		gorilla1.climb();
		gorilla1.displayEnergy();
	}

}
