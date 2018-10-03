package com.rem.fortune.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rem.fortune.dao.SupplierDao;
import com.rem.fortune.model.CustomerSupplier;
import com.rem.fortune.ws.service.CustomerSupplierService;
import com.rem.fortune.ws.util.FortuneUtil;
@Service("CustSuppService")
public class CustomerSupplierServiceImpl implements CustomerSupplierService{
	@Autowired
	private SupplierDao supplierDao;
 
	public CustomerSupplier getById(String id){ 
		return supplierDao.getById(Integer.valueOf(id));
	} 

	public ResponseEntity create(CustomerSupplier custSupp){
		int size= supplierDao.create(custSupp);
		return FortuneUtil.generateWSResponse(size);
	}

	@Override
	public List<CustomerSupplier> getAllSupplier(int isCustomer){
		return supplierDao.getAll(isCustomer);
	}

	@Override
	public ResponseEntity deleteById(int id){
		int size = supplierDao.deleteById(id);
		return FortuneUtil.generateWSResponse(size);
	}

	@Override
	public ResponseEntity update(CustomerSupplier custSupp){
		int size=supplierDao.updateById(custSupp);
		supplierDao.updateAddressById(custSupp);
		return FortuneUtil.generateWSResponse(size);
	}

}
