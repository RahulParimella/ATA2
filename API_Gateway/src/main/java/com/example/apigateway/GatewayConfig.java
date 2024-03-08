package com.example.apigateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.apigateway.filter.AuthenticationFilter;
import com.example.apigateway.filter.AuthenticationFilter.Config;

@Configuration

public class GatewayConfig {

	 @Autowired
	    private AuthenticationFilter authenticationFilter;

	    @Bean
	    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
	        return builder.routes()
	                .route("Driver-Microservices", r -> r
	                        .path("/api/driver/**")
	                        .filters(f -> f.filter(authenticationFilter.apply(new AuthenticationFilter.Config())))

	                        .uri("http://localhost:8086"))
	                .route("Booking-Microservices", r -> r
	                        .path("/api/booking/**")
	                        .filters(f -> f.filter(authenticationFilter.apply(new AuthenticationFilter.Config())))
	                        .uri("http://localhost:8085"))
	                .route("Route-Microservices", r -> r
	                        .path("/api/route/**")
	                        .filters(f -> f.filter(authenticationFilter.apply(new AuthenticationFilter.Config())))

	                        .uri("http://localhost:8087"))
	                .route("Indentity-Microservice", r -> r
	                        .path("/auth/**")
	                        .uri("http://localhost:8088"))
	                .route("Vehicle-Microservice", r -> r
	                        .path("/api/vehicle/**")
	                        .filters(f -> f.filter(authenticationFilter.apply(new AuthenticationFilter.Config())))

	                        .uri("http://localhost:8089"))
	                .build();
	    }
	}