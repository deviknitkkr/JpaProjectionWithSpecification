package com.vikas.service;

import java.util.List;

import com.vikas.entity.Address;
import com.vikas.repository.AddressRepository;
import com.vikas.repository.PartialAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
	
	@Autowired
	AddressRepository addressrepo;
	
	public List<Address> getAllAddress(Specification<Address> specification){
		return addressrepo.findAll(specification);
	}
	
	public Page<PartialAddress> getPartialAddress(Specification<Address> specification, Pageable pageable){
		return addressrepo.findAll(specification,PartialAddress.class,pageable);
	}
	
}