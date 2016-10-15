package com.antiiimage.springlearing.jpa.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PAY_ENTITY")
public class PayEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9031142350037356327L;

	@Id
	@Column(name = "ENTITY_CODE")
	private String entityCode;
	@Column(name = "COUNTRY_CODE2")
	private String countryCode2;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "payEntity", cascade = CascadeType.ALL)
	private List<PayEntityDetails> payEntityDetails;

	public String getEntityCode() {
		return entityCode;
	}

	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	public String getCountryCode2() {
		return countryCode2;
	}

	public void setCountryCode2(String countryCode2) {
		this.countryCode2 = countryCode2;
	}

	public List<PayEntityDetails> getPayEntityDetails() {
		return payEntityDetails;
	}

	public void setPayEntityDetails(List<PayEntityDetails> payEntityDetails) {
		this.payEntityDetails = payEntityDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "PayEntity [entityCode=" + entityCode + ", countryCode2=" + countryCode2 + ", payEntityDetails="
				+ payEntityDetails.size() + "]";
	}
	
	

}
