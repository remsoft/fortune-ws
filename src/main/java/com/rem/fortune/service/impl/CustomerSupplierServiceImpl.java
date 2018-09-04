package com.rem.fortune.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rem.fortune.dao.SupplierDao;
import com.rem.fortune.model.CustomerSupplier;
import com.rem.fortune.service.CustomerSupplierService;
@Service("CustSuppService")
public class CustomerSupplierServiceImpl implements CustomerSupplierService{
	@Autowired
	private SupplierDao supplierDao;
	
	public CustomerSupplier getCustomerSupplier(String id) {
		return supplierDao.getCustomerSupportById(id);
	}
}
