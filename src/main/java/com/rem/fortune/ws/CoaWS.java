package com.rem.fortune.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rem.fortune.model.Coa;
import com.rem.fortune.service.CoaService;

@RestController
@RequestMapping("/coa")
public class CoaWS {
	@Autowired
	CoaService coaService;
	
	@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"  })
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	@ResponseBody
	public List<Coa> getAllSupplier(@RequestParam(value="accType") String accType ) {
		return coaService.getAllCoa(accType);
	}
	
	@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"  })
	@RequestMapping(value="/getcoadd",method=RequestMethod.GET)
	@ResponseBody
	public Coa getCoaLevelDropDown() {
		return coaService.getCoaLevelDropDown();
	}
	
	@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"  })
	@RequestMapping(value="/create",method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> create(@RequestBody Coa coa) {
		return coaService.create(coa);
	}

}
