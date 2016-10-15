package com.antiiimage.springlearing.jpa.dao;

import java.util.List;

import com.antiiimage.springlearing.jpa.domain.PayEntity;

public interface PayEntityDao {

	String save(PayEntity p);

	List<PayEntity> getAll();

}
