package com.singtel.coding.test;

class Animal {
	void walk() {
		System.out.println("I am walking");
	}

	void sing() {
		System.out.println("I am Singing");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}
}

public class Solution {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}