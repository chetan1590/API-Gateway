package com.example.Microservice3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Microservice3.beans.PropertyAccessBean;
import com.example.Microservice3.beans.PropertyAccessValue;

@RestController
@RequestMapping(path = "/service-three")
public class Controller {

	@Autowired
	PropertyAccessBean propertyAccessBean;

	@GetMapping(path = "/access")
	public PropertyAccessValue getPropertyAccessValues() {
		return new PropertyAccessValue(propertyAccessBean.getName(), propertyAccessBean.getDescription());
	}

}
