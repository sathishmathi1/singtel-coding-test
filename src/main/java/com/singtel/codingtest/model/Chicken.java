package com.singtel.codingtest.model;

public class Chicken extends Animal{

	public Chicken() {
		super(true, false, false, false);
	}

	@Override
	public String getSound() {
		return "Cluck, cluck";
	}
	
	

}
