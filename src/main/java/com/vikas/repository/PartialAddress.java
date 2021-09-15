package com.vikas.repository;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface PartialAddress {
	@JsonProperty("zip_code")
	String getZipCode();
	String getState();
}