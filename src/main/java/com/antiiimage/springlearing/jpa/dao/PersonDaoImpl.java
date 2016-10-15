package com.antiiimage.springlearing.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.antiiimage.springlearing.jpa.domain.Person;

@Transactional
public class PersonDaoImpl implements PersonDao {

	@PersistenceContext
	private EntityManager em;
	@Override
	public Long save(Person p) {
		em.persist(p);
		return p.getId();
	}

	@Override
	public List<Person> getAll() {
		return em.createQuery("SELECT p FROM Person p", Person.class).getResultList();
	}

}
