package com.singtel.codingtest.model;

public class Dolphins extends Animal {

	public Dolphins(){
		super(true,false,false,true);
	}

	@Override
	public String getSound() {
		return "";
	}
	
	@Override
	public void printAnimal(String name) {
		System.out.println(name + " can " + (this.isSwiming() ? "" : "not")
				+ "swim, and can " + (this.isFlying() ? "" : "not ") + "fly, and can "
				+ (this.isWalking() ? "" : "not ") + "walk.");
	}
}
