package com.rem.fortune.service;

import java.util.List;

import com.rem.fortune.model.CustomerSupplier;

public interface CustomerSupplierService {
	public CustomerSupplier getById(String id) throws Exception;
	public int create(CustomerSupplier custSupp) throws Exception;
	public List<CustomerSupplier> getAllSupplier(int isCustomer) throws Exception;	
	public int deleteById(int id) throws Exception;
	public int update(CustomerSupplier custSup) throws Exception;
}
