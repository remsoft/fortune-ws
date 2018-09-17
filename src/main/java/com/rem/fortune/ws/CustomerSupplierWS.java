package com.rem.fortune.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rem.fortune.model.CustomerSupplier;
import com.rem.fortune.service.CustomerSupplierService;

@RestController
@RequestMapping("/custsupp")
public class CustomerSupplierWS {
	@Autowired	
	private CustomerSupplierService customerSupplierService;

	@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080" })
	@RequestMapping(value="/get",method=RequestMethod.GET)
	@ResponseBody
	public CustomerSupplier getById(@RequestParam(value="id") String id) {
		try {
			return customerSupplierService.getById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"  })
	@RequestMapping(value="/create",method=RequestMethod.POST)
	@ResponseBody
	public CustomerSupplier create(@RequestBody CustomerSupplier custSupp) {
		try {
			customerSupplierService.create(custSupp);
			return custSupp;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"  })
	@RequestMapping(value="/getall",method=RequestMethod.GET)
	@ResponseBody
	public List<CustomerSupplier> getAllSupplier(@RequestParam(value="isc") String isCustomer) {
		try {
			return customerSupplierService.getAllSupplier(Integer.valueOf(isCustomer));
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"  })
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	@ResponseBody
	public ResponseEntity<String> deleteById(@RequestParam(value="id") int id) {
		try {
			customerSupplierService.deleteById(id);
			return new ResponseEntity<>("Successfully Deleted", HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<>("Fail to Delete", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"  })
	@RequestMapping (value="/update",method=RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<String> update(@RequestBody CustomerSupplier custSupp){
		try {
			customerSupplierService.update(custSupp);
			return new ResponseEntity<>("Successfully Updated",HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<>("Fail to Update", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
