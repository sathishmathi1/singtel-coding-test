package com.singtel.codingtest.model;

public class Parrot extends Animal {
	
	private Animal animal;

	public Parrot(){
		super(true,true,true,false);
	}
	
	public Parrot(Animal animal){
		super(true,true,true,false);
		this.animal = animal;
	}

	@Override
	public String getSound() {		
		return animal.getSound();
	}
		
}
