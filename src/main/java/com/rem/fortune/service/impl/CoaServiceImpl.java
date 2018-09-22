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
	public List<Coa> getAllCoa() {
		return coaDao.getAll();
	} 

}
