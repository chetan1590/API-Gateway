package com.example.Microservice1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Microservice1.beans.PropertyAccessBean;
import com.example.Microservice1.beans.PropertyAccessValue;

@RestController
@RequestMapping(path = "/service-one")
public class Controller {

	@Autowired
	PropertyAccessBean propertyAccessBean;
	
	//@Autowired
	//Service4Integration service4Integration; 

	@GetMapping(path = "/access")
	public PropertyAccessValue getPropertyAccessValues() {
		//return service4Integration.getPropertyAccessValue();
		return new PropertyAccessValue(propertyAccessBean.getName(), propertyAccessBean.getDescription());
	}

}
