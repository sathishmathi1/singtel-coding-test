package com.singtel.codingtest.model;

public class Butterfly extends Animal{

	public Butterfly(){
		super(false,true,false,false);
	}

	@Override
	public String getSound() {
		return "doesnt make sound";
	}
	
	@Override
	public void printAnimal(String name) {
		System.out.println("A " + name + this.getSound()+ " and can " + (this.isSwiming() ? "" : "not")
				+ "swim, and can " + (this.isFlying() ? "" : "not ") + "fly, and can "
				+ (this.isWalking() ? "" : "not ") + "walk.");
	}
}
