package com.antiiimage.springlearing.jpa.dao;

import java.util.List;

import com.antiiimage.springlearing.jpa.domain.Person;

public interface PersonDao {
	
	public Long save(Person p);
	
	public List<Person> getAll();

}
