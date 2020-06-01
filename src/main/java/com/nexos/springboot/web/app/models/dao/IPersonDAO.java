package com.nexos.springboot.web.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexos.springboot.web.app.models.entity.Person;

public interface IPersonDAO extends JpaRepository<Person, Integer> {
	
}
