package com.rem.fortune.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.rem.fortune.model.CustomerSupplier;

public interface CustomerSupplierService {
	public CustomerSupplier getById(String id);
	public int create(CustomerSupplier custSupp);
	public List<CustomerSupplier> getAllSupplier(int isCustomer);	
	public ResponseEntity deleteById(int id);
	public ResponseEntity update(CustomerSupplier custSup);
}
