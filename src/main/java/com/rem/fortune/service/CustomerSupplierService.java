package com.rem.fortune.service;

import java.util.List;

import com.rem.fortune.model.CustomerSupplier;

public interface CustomerSupplierService {
	public CustomerSupplier getCustomerSupplier(String id);
	public int createCustomerSupplier(CustomerSupplier custSupp);
	public List<CustomerSupplier> getAllCustomerSupplier(int isCustomer);	
}
