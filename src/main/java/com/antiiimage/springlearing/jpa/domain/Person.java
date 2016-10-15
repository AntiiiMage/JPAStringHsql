package com.antiiimage.springlearing.jpa.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9031142350037356327L;

	@Id
	@GeneratedValue
	private Long id;
	private String personName;
	private String surname;

	public Person() {
	}

	public Person(String personName, String surname) {
		this.personName = personName;
		this.surname = surname;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", personName=" + personName + ", surname=" + surname + "]";
	}

}
