package com.antiiimage.springlearing.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PAY_ENTITY_DETAILS")
public class PayEntityDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4787947681140703031L;

	@Id
	@GeneratedValue
	@Column(name = "INTERNAL_ID")
	private Long internalId;
	
//	@Column(name = "ENTITY_CODE")
//	private String entityCode;
	
	@ManyToOne
	@JoinColumn(name = "ENTITY_CODE")
	private PayEntity payEntity;

	public Long getInternalId() {
		return internalId;
	}

	public void setInternalId(Long internalId) {
		this.internalId = internalId;
	}

//	public String getEntityCode() {
//		return entityCode;
//	}
//
//	public void setEntityCode(String entityCode) {
//		this.entityCode = entityCode;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public PayEntity getPayEntity() {
		return payEntity;
	}

	public void setPayEntity(PayEntity payEntity) {
		this.payEntity = payEntity;
	}

}
