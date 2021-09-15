package com.vikas.controller;

import java.util.List;

import com.vikas.entity.Address;
import com.vikas.repository.PartialAddress;
import com.vikas.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.web.annotation.*;

@RestController
public class AddressController {

	@Autowired
	AddressService addresService;

	@GetMapping("/address")
	public List<Address> getAllAddress(
		@And({@Spec(path = "zipCode", params = "zipcode", spec = Equal.class),
			  @Spec(path = "state", params = "state", spec = Equal.class)
			 }) Specification<Address> spec) {

		return addresService.getAllAddress(spec);
	}

	@GetMapping("/partial")
	public List<PartialAddress> getAllPartialAddress(
		@And({@Spec(path = "zipCode", params = "zipcode", spec = Equal.class),
			  @Spec(path = "state", params = "state", spec = Equal.class)
			 }) Specification<Address> spec, Pageable pageable) {

		return addresService.getPartialAddress(spec, pageable).getContent();
	}
}