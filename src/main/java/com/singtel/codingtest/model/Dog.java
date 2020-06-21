package com.singtel.codingtest.model;

public class Dog extends Animal {

	public Dog(){
		super(true,false,false,true);
	}

	@Override
	public String getSound() {
		return "Woof, woof";
	}
}
