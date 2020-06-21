package com.singtel.coding.test;

import org.junit.Test;

import com.singtel.coding.test.Bird;


public class SolutionTest {

	/**
	 * Question 1a. 
	 */
	@Test
	public void IsBirdSinging(){		
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
