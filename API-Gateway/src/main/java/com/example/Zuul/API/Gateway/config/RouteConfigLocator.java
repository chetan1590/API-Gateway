package com.example.Zuul.API.Gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfigLocator {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder
				.routes()
				.route("service-one", r -> r.path("/service-one/**").uri("http://localhost:8100/"))
				.route("service-two", r -> r.path("/service-two/**").uri("http://localhost:8200/"))
				.route("service-three", r -> r.path("/service-three/**").uri("http://localhost:8300/"))
				.build();
	}
}
