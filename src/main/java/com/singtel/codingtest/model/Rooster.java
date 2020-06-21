package com.singtel.codingtest.model;

public class Rooster {

	/**
	 * Delegate
	 */
	Animal chicken;
	
	public Rooster(Animal chicken) {
		this.chicken = chicken;
	}

	public String getSound() {
		return chicken.getSound();
	}

}
