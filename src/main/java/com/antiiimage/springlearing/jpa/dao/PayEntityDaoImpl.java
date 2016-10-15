package com.antiiimage.springlearing.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.antiiimage.springlearing.jpa.domain.PayEntity;

@Transactional
public class PayEntityDaoImpl implements PayEntityDao {

	@PersistenceContext
	private EntityManager em;
	@Override
	public String save(PayEntity p) {
		em.persist(p);
		return p.getEntityCode();
	}

	@Override
	public List<PayEntity> getAll() {
		return em.createQuery("SELECT payentity FROM PayEntity payentity", PayEntity.class).getResultList();
	}

}
