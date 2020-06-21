package com.singtel.codingtest.model;

public class Clownfish extends Fish{

	public Clownfish (){
		super();
	}
	
	@Override
	public String getColor() {
		return "small and colourful (orange)";
	}

	@Override
	public String getBehaviour() {
		return "make jokes";
	}
	
	@Override
	public void printAnimal(String name) {
		System.out.println(name+" are " + getColor()+", and "+ getBehaviour());
	}
}
