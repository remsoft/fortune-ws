package com.rem.fortune.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rem.fortune.model.CustomerSupplier;
import com.rem.fortune.service.CustomerSupplierService;

@RestController
public class CustomerSupplierWS {
	@Autowired	
	private CustomerSupplierService custSuppService;

	@RequestMapping(value="/CustSuppQuery/{id}",method=RequestMethod.GET)
	@ResponseBody
	public CustomerSupplier getCustomerSupplier(@PathVariable("id") String id) {
		return custSuppService.getCustomerSupplier(id);
	}


}
