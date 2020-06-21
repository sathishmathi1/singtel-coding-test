package com.singtel.codingtest.sample.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.codingtest.model.Animal;
import com.singtel.codingtest.sample.model.Model;
import com.singtel.codingtest.sample.service.ModelService;

@RestController
public class ModelController {
    @Autowired
    private ModelService modelService;

    @RequestMapping(value = "/rooster", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewModel(@RequestBody @Valid Model model) {
        modelService.createRoosterSoud(model);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Map<String, Animal> getAllModels() {
        return modelService.getAllAnimals();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Animal getModelById(@PathVariable String name) {
        return modelService.getAnimalInfoByName(name);
    }
    
    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Map<String, String> getCountDetails() {
        return modelService.getCountDetails();
    }
}
