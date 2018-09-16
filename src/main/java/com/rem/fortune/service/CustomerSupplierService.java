package com.rem.fortune.service;

import java.util.List;

import com.rem.fortune.model.CustomerSupplier;

public interface CustomerSupplierService {
	public CustomerSupplier getById(String id);
	public int create(CustomerSupplier custSupp);
	public List<CustomerSupplier> getAllSupplier(int isCustomer);	
	public int deleteById(int id);
}
