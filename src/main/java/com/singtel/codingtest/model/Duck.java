package com.singtel.codingtest.model;

public class Duck extends Animal{

	public Duck(){
		super(true,false,false,true);
	}

	@Override
	public String getSound() {
		return "Quack, quack";
	}
}
