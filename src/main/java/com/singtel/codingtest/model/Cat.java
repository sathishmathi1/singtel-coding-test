package com.singtel.codingtest.model;

public class Cat extends Animal {

	public Cat(){
		super(true,false,false,false);
	}

	@Override
	public String getSound() {
		// TODO Auto-generated method stub
		return "Meow";
	}
}
