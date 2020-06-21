package com.singtel.codingtest.model;

public abstract class Animal {

	protected boolean isWalking;

	protected boolean isFlying;

	protected boolean isSinging;

	protected boolean isSwiming;

	public Animal(boolean isWalking, boolean isFlying, boolean isSinging, boolean isSwiming) {
		super();
		this.isWalking = isWalking;
		this.isSinging = isSinging;
		this.isFlying = isFlying;
		this.isSwiming = isSwiming;
	}

	public boolean isWalking() {
		return isWalking;
	}

	public boolean isSinging() {
		return isSinging;
	}

	public boolean isFlying() {
		return isFlying;
	}

	public boolean isSwiming() {
		return isSwiming;
	}

	abstract public String getSound();

	public void printAnimal(String name) {
		System.out.println("A " + name + " says '" + this.getSound() + "', can " + (this.isSwiming() ? "" : "not")
				+ "swim, and can " + (this.isFlying() ? "" : "not ") + "fly, and can "
				+ (this.isWalking() ? "" : "not ") + "walk.");
	}

}
