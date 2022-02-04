package com.example.Microservice1.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Microservice1.beans.PropertyAccessValue;

@FeignClient(name = "SERVICE-FOUR", url = "/service-four")
public interface Service4Integration {

	@GetMapping(path = "/access")
	public PropertyAccessValue getPropertyAccessValue();
}
