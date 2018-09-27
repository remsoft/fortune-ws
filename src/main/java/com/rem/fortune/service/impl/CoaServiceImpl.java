package com.rem.fortune.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rem.fortune.dao.AccountTypeDao;
import com.rem.fortune.dao.BranchDao;
import com.rem.fortune.dao.CoaDao;
import com.rem.fortune.dao.DivisionDao;
import com.rem.fortune.dao.SupplierDao;
import com.rem.fortune.model.Coa;
import com.rem.fortune.service.CoaService;

@Service("CoaService")
public class CoaServiceImpl implements CoaService{
	@Autowired
	CoaDao coaDao;
	@Autowired
	AccountTypeDao accountTypeDao;
	@Autowired
	BranchDao branchDao;
	@Autowired
	DivisionDao divisionDao;
	@Autowired
	SupplierDao supplierDao;
	
	@Override
	public List<Coa> getAllCoa(String accountType) {
		int accTypeNo =0;
		if("all".equals(accountType)) {
			accTypeNo=0;
		}else if("asset".equals(accountType)) {
			accTypeNo=1;
		}else if("liability".equals(accountType)) {
			accTypeNo=2;
		}else if("equity".equals(accountType)) {
			accTypeNo=3;
		}else if("expense".equals(accountType)) {
			accTypeNo=4;
		}else if("revenue".equals(accountType)) {
			accTypeNo=5;
		}else if("archive".equals(accountType)) {
			accTypeNo=6;
		}		
		return coaDao.getAll(accTypeNo);
	}

	@Override
	public Coa getCoaLevelDropDown() {
		Coa coa =new Coa();
		coa.setAccountTypes(accountTypeDao.getAllForDropDown()); 
		coa.setBranches(branchDao.getAllForDropDown());
		coa.setDivisions(divisionDao.getAllForDropDown());
		coa.setCustSupps(supplierDao.getAllForDropDown());
		return coa;
	}

	@Override
	public ResponseEntity create(Coa coa) {
		System.out.println(coa.toString());
		return new ResponseEntity<>("Successfully Updated",HttpStatus.OK);
	} 

}
