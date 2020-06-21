package com.singtel.codingtest.model;

public class Fish extends Animal {

	public Fish() {
		super(false, false, false, true);
	}

	@Override
	public String getSound() {
		return "";
	}

	public String getColor() {
		return "";
	}

	public String getBehaviour() {
		return "";
	}

	@Override
	public void printAnimal(String name) {
		System.out.println("A " + name + " can " + (this.isSwiming() ? "" : "not") + "swim, and "
				+ (this.isFlying() ? "can " : "don't ") + "fly, and " + (this.isWalking() ? "can" : " don't ")
				+ "walk.");
	}

}
