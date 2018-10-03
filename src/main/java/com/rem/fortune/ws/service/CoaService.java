package com.rem.fortune.ws.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.rem.fortune.model.Coa;

public interface CoaService {
	public List<Coa> getAllCoa(String accountType, String coaCd);
	public Coa getCoaLevelDropDown(); 
	public ResponseEntity create(Coa coa);
	public ResponseEntity update(Coa coa); 
	public ResponseEntity delete(int id);

}
