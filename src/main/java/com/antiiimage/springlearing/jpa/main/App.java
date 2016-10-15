package com.antiiimage.springlearing.jpa.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.antiiimage.springlearing.jpa.dao.PersonDao;
import com.antiiimage.springlearing.jpa.domain.Person;


public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonDao personDao = (PersonDao) context.getBean("personDao");
		Person peter = new Person("XML", "HTML");
		Person nasta = new Person("Java", "SQL");
		personDao.save(peter);
		personDao.save(nasta);
		List<Person> persons = personDao.getAll();
		
		for(Person p : persons){
			System.out.println(p.toString());
		}
		context.close();

	}

}
