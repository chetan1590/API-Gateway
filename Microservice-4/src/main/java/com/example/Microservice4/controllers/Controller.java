package com.example.Microservice4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Microservice4.beans.PropertyAccessBean;
import com.example.Microservice4.beans.PropertyAccessValue;

@RestController
@RequestMapping(path = "/service-four")
public class Controller implements Runnable {

	@Autowired
	PropertyAccessBean propertyAccessBean;

	@GetMapping(path = "/access")
	public PropertyAccessValue getPropertyAccessValues() {
		Controller controller = new Controller();
		Thread thread = new Thread(controller);
		thread.start();
		return new PropertyAccessValue("SERVICE FOUR", "This is short description of service four!!");
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			try {
				wait(10000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
