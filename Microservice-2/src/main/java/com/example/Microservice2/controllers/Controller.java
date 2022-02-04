package com.example.Microservice2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Microservice2.beans.PropertyAccessBean;
import com.example.Microservice2.beans.PropertyAccessValue;

@RestController
@RequestMapping(path = "/service-two")
public class Controller {

	@Autowired
	PropertyAccessBean propertyAccessBean;

	@GetMapping(path = "/access")
	public PropertyAccessValue getPropertyAccessValues() {
		return new PropertyAccessValue(propertyAccessBean.getName(), propertyAccessBean.getDescription());
	}

}
