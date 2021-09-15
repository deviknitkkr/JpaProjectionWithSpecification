package com.vikas.entity;

import javax.persistence.*;

@Entity
public class Address {
	
	@Id
	Integer zipCode;
	String state;
	String village;
	
	public Address(){}
	
	public Address(Integer zipCode, String state, String village) {
		this.zipCode = zipCode;
		this.state = state;
		this.village = village;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getVillage() {
		return village;
	}
}