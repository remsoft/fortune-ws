package com.rem.fortune.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rem.fortune.dao.SupplierDao;
import com.rem.fortune.model.CustomerSupplier;
import com.rem.fortune.service.CustomerSupplierService;
@Service("CustSuppService")
public class CustomerSupplierServiceImpl implements CustomerSupplierService{
	@Autowired
	private SupplierDao supplierDao;
	
	public CustomerSupplier getById(String id) { 
		return supplierDao.getById(Integer.valueOf(id));
	}

	public int create(CustomerSupplier custSupp) {
		return supplierDao.create(custSupp);
	}

	@Override
	public List<CustomerSupplier> getAllSupplier(int isCustomer) {
		return supplierDao.getAll(isCustomer);
	}

	@Override
	public int deleteById(int id) {
		return supplierDao.deleteById(id);
	}
	
	
	
}
