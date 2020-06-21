package com.singtel.codingtest.model;

public class Caterpillar extends Butterfly {

	public Caterpillar(){
		super();
		super.isWalking=true;
		super.isFlying = false;		
	}
	
	@Override
	public void printAnimal(String name) {
		System.out.println("A " + name + this.getSound()+ " and can " + (this.isSwiming() ? "" : "not")
				+ "swim, and can " + (this.isFlying() ? "" : "not ") + "fly, and can "
				+ (this.isWalking() ? "" : "not ") + "walk (crawl)");
	}
}
