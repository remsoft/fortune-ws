package com.rem.fortune.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rem.fortune.dao.CoaDao;
import com.rem.fortune.model.Coa;
import com.rem.fortune.service.CoaService;

@Service("CoaService")
public class CoaServiceImpl implements CoaService{
	@Autowired
	CoaDao coaDao;
	
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

}
