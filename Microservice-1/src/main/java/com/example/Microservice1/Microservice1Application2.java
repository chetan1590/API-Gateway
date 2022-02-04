package com.example.Microservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Microservice1Application2 {

	public static void main(String[] args) {
		SpringApplication.run(Microservice1Application2.class, args);
	}

}
