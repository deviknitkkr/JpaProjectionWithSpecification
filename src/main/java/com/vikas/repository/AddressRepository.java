package com.vikas.repository;

import com.vikas.entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import th.co.geniustree.springdata.jpa.repository.JpaSpecificationExecutorWithProjection;

@Repository
public interface AddressRepository extends
	JpaRepository<Address, Integer>,
	JpaSpecificationExecutor<Address>,
	JpaSpecificationExecutorWithProjection<Address> {

}