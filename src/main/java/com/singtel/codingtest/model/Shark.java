package com.singtel.codingtest.model;

public class Shark extends Fish {

	public Shark (){
		super();
	}
	
	@Override
	public String getColor() {
		return "large and grey";
	}

	@Override
	public String getBehaviour() {
		return "eat other fish";
	}
	
	@Override
	public void printAnimal(String name) {
		System.out.println(name+" are " + getColor()+", and "+ getBehaviour());
	}
	
}
