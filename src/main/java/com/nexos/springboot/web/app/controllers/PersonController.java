package com.nexos.springboot.web.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nexos.springboot.web.app.interceptors.DTOValidator;
import com.nexos.springboot.web.app.models.entity.Person;
import com.nexos.springboot.web.app.models.service.IPerson;

@RestController
@RequestMapping(value = "/person")
@Validated
public class PersonController {

	private static final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);
	
	@Autowired
	IPerson service;
	protected DTOValidator validator;
	
	@GetMapping
	public List<Person> listFamily(){
		List<Person> family = service.listFamily();
		return family;
		
	}
	
	@GetMapping(path="/{id}")	
	public Person getPerson(@PathVariable(name="id") int id){
		
		Person person = service.getPerson(id);
		
		validator.validate(person);
		
		return person;
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String createPerson(@RequestBody @Valid Person person){
		
		validator.validate(person);
		
		service.createPerson(person);
		
		return "El cliente fue creado de forma exitosa";
	}
	
	@PatchMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updatePerson(@PathVariable(name = "id") int id,@RequestBody @Valid Person person){
		
		validator.validate(person);
		
		service.updatePerson(id,person);

	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePerson(@PathVariable(name = "id") int id){
		
		service.deletePerson(id);
	}
	
}
