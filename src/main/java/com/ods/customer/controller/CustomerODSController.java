package com.ods.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ods.customer.domain.pojo.Address;
import com.ods.customer.domain.request.CustomerDetailsRequestBean;
import com.ods.customer.domain.response.Category;
import com.ods.customer.domain.response.CustomerDetailsResponseBean;
import com.ods.customer.services.CustomerODSService;

@RestController
@RequestMapping("/ods/customer")
public class CustomerODSController {
	
	@Autowired
	CustomerODSService customerODSService;
	
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public CustomerDetailsResponseBean getCustomerDetails(@PathVariable String id) {
		customerODSService.ping();
		if (id.equals("10")) {
			return new CustomerDetailsResponseBean(10, "Nevil", new Address("US","NY","NY"));
		} else {
			return new CustomerDetailsResponseBean(12, "Nevil", new Address("US","LA","LA"));	
		}
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public CustomerDetailsResponseBean createCustomer(@RequestBody CustomerDetailsRequestBean custDetailsRequest) {
		Address add = custDetailsRequest.getAddress();
		
		return new CustomerDetailsResponseBean(1000, custDetailsRequest.getName(), add);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/categories")
	public List<Category> getCategories(){
		CustomerODSService service = new CustomerODSService();
		return service.test();
	}
}
