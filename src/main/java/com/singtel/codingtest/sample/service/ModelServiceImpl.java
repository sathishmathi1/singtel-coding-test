package com.singtel.codingtest.sample.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.singtel.codingtest.model.Animal;
import com.singtel.codingtest.model.Bird;
import com.singtel.codingtest.model.Butterfly;
import com.singtel.codingtest.model.Cat;
import com.singtel.codingtest.model.Chicken;
import com.singtel.codingtest.model.Clownfish;
import com.singtel.codingtest.model.Dog;
import com.singtel.codingtest.model.Dolphins;
import com.singtel.codingtest.model.Duck;
import com.singtel.codingtest.model.Fish;
import com.singtel.codingtest.model.Frog;
import com.singtel.codingtest.model.Parrot;
import com.singtel.codingtest.model.Rooster;
import com.singtel.codingtest.model.Shark;
import com.singtel.codingtest.sample.model.Model;

@Service("modelService")
public class ModelServiceImpl implements ModelService {

	private List<Animal> animalList = new ArrayList<>();

	Map<String, String> roosterMap = new HashMap<>();

	@PostConstruct
	public void getAnimalList() {
		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(new Dog()),
				new Fish(), new Shark(), new Clownfish(), new Dolphins(), new Frog(), new Dog(), new Butterfly(),
				new Cat() };

		animalList = Arrays.asList(animals);

		roosterMap.put("Danish", "kykyliky");
		roosterMap.put(" Dutch", "kukeleku");
		roosterMap.put(" Finnish", "kukko kiekuu");
		roosterMap.put(" French", "cocorico");
		roosterMap.put(" German", "kikeriki");
		roosterMap.put(" Greek", "kikiriki");
		roosterMap.put(" Hebrew", "coo-koo-ri-koo");
		roosterMap.put(" Hungarian", "kukuriku");
		roosterMap.put(" Italian", "chicchirichi");
		roosterMap.put(" Japanese", "ko-ke-kok-ko-o");
		roosterMap.put(" Portuguese", "cucurucu");
		roosterMap.put(" Russian", "kukareku");
		roosterMap.put(" Swedish", "kuckeliku");
		roosterMap.put(" Turkish", "kuk-kurri-kuuu");
		roosterMap.put(" Urdu", "kuklooku");
	}


	@Override
	public Animal getAnimalInfoByName(String name) {

		if (!animalList.isEmpty()) {

			Optional<Animal> anmailOpt = animalList.stream()
					.filter(animal -> animal.getClass().getSimpleName().equalsIgnoreCase(name)).findFirst();

			if (anmailOpt.isPresent()) {
				return anmailOpt.get();
			}
		}

		return null;

	}

	@Override
	public Map<String, Animal> getAllAnimals() {
		return animalList.stream()
				.collect(Collectors.toMap(animal -> animal.getClass().getSimpleName(), animal -> animal));

	}

	@Override
	public Map<String, String> getCountDetails() {

		Map<String, String> countsMap = new LinkedHashMap<>();

		countsMap.put("how many of these animals can fly ? ",
				String.valueOf(animalList.stream().filter(ani -> ani.isFlying()).count()));
		countsMap.put("how many of these animals can sing ? ",
				String.valueOf(animalList.stream().filter(ani -> ani.isSinging()).count()));
		countsMap.put("how many of these animals can swim ? ",
				String.valueOf(animalList.stream().filter(ani -> ani.isSwiming()).count()));
		countsMap.put("how many of these animals can walk ? ",
				String.valueOf(animalList.stream().filter(ani -> ani.isWalking()).count()));

		return countsMap;
	}

	@Override
	public void createRoosterSoud(Model model) {
		roosterMap.put(model.getLanguage(), model.getSound());
	}
}
