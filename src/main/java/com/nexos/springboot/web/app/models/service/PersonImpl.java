package com.nexos.springboot.web.app.models.service;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexos.springboot.web.app.interceptors.PersonException;
import com.nexos.springboot.web.app.models.dao.IPersonDAO;
import com.nexos.springboot.web.app.models.entity.Person;

@Service
public class PersonImpl implements IPerson {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonImpl.class);
	
	@Autowired
	IPersonDAO personDAO;

	@Override
	@Transactional(readOnly = true)
	public List<Person> listFamily() {
		return personDAO.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}

	@Override
	@Transactional(readOnly = true)
	public Person getPerson(int id) {
		Person person = personDAO.findById(id).orElse(null);
		if(person==null) {
			throw new PersonException("No se encontro registros en la base de datos");
		}
		return person;
	}

	@Override
	public void createPerson(Person person) {
		
		personDAO.save(person);
		
	}

	@Override
	public void updatePerson(int id, @Valid Person person) {
		
		getPerson(id);
		if(person.getId()==id) {
		personDAO.save(person);
		}else {
			throw new PersonException("La identificación debe coincidir tanto en la URL como en el cuerpo");
		}
	}

	@Override
	public void deletePerson(int id) {
		
		getPerson(id);
		personDAO.deleteById(id);
		
	}
	
}
