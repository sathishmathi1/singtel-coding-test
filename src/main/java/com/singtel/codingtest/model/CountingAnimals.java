package com.singtel.codingtest.model;

import java.util.Arrays;
import java.util.List;

public class CountingAnimals {

	public static void main(String args[]) {
		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(),
				new Fish(), new Shark(), new Clownfish(), new Dolphins(), new Frog(), new Dog(), new Butterfly(),
				new Cat() };

		List<Animal> animalList = Arrays.asList(animals);

		if (!animalList.isEmpty()) {
			System.out.println(
					"how many of these animals can fly ? " + animalList.stream().filter(ani -> ani.isFlying()).count());
			System.out.println("how many of these animals can sing ? "
					+ animalList.stream().filter(ani -> ani.isSinging()).count());
			System.out.println("how many of these animals can swim ? "
					+ animalList.stream().filter(ani -> ani.isSwiming()).count());
			System.out.println("how many of these animals can walk ? "
					+ animalList.stream().filter(ani -> ani.isWalking()).count());

		}
	}

}
