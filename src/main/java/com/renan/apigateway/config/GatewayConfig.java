package com.renan.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("client", r -> r
						.path("/client")
						.uri("http://localhost:8081/"))
				.route("staff", r -> r
						.path("/staff")
						.uri("http://localhost:8082/"))
				.build();
			
	}
}
