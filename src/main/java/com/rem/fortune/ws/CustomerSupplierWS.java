package com.rem.fortune.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rem.fortune.model.CustomerSupplier;
import com.rem.fortune.service.CustomerSupplierService;

@RestController
public class CustomerSupplierWS {
	@Autowired	
	private CustomerSupplierService customerSupplierService;

	@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080" })
	@RequestMapping(value="/getcustsup",method=RequestMethod.GET)
	@ResponseBody
	public CustomerSupplier getCustomerSupplier(@RequestParam(value="id") String id) {
		return customerSupplierService.getCustomerSupplier(id);
	}
	
	@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"  })
	@RequestMapping(value="/createcustsup",method=RequestMethod.POST)
	@ResponseBody
	public CustomerSupplier createCustomerSupplier(@RequestBody CustomerSupplier custSupp) {
		customerSupplierService.createCustomerSupplier(custSupp);
		System.out.println(custSupp.toString());
		return custSupp;
		
	}

	@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8080"  })
	@RequestMapping(value="/getcustsupall",method=RequestMethod.GET)
	@ResponseBody
	public List<CustomerSupplier> getAllCustomerSupplier(@RequestParam(value="isc") String isCustomer) {
		return customerSupplierService.getAllCustomerSupplier(Integer.valueOf(isCustomer));
	}

}
