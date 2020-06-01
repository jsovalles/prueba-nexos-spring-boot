package com.nexos.springboot.web.app.models.service;

import java.util.List;

import javax.validation.Valid;

import com.nexos.springboot.web.app.models.entity.Person;

public interface IPerson {
	
	List<Person> listFamily();

	Person getPerson(int id);

	void createPerson(Person person);

	void updatePerson(int id, @Valid Person person);

	void deletePerson(int id);

}
