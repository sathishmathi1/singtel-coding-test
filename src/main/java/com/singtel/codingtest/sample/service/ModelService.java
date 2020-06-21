package com.singtel.codingtest.sample.service;

import java.util.Map;

import com.singtel.codingtest.model.Animal;
import com.singtel.codingtest.sample.model.Model;

public interface ModelService {
	void createRoosterSoud(Model model);

	Animal getAnimalInfoByName(String name);

	Map<String, Animal> getAllAnimals();

	Map<String, String> getCountDetails();
	
	
}
