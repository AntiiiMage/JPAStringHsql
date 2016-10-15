package com.antiiimage.springlearing.jpa.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.antiiimage.springlearing.jpa.dao.PayEntityDao;
import com.antiiimage.springlearing.jpa.domain.PayEntity;
import com.antiiimage.springlearing.jpa.domain.PayEntityDetails;


public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PayEntityDao personDao = (PayEntityDao) context.getBean("payEntityDao");
		PayEntity payEntity = new PayEntity();
		payEntity.setEntityCode("14024");
		payEntity.setCountryCode2("HK");
		PayEntityDetails payDetail = new PayEntityDetails();
		payDetail.setPayEntity(payEntity);
		payEntity.setPayEntityDetails(Arrays.asList(payDetail));
		personDao.save(payEntity);
		List<PayEntity> persons = personDao.getAll();
		
		for(PayEntity p : persons){
			System.out.println(p.toString());
		}
		context.close();

	}

}
