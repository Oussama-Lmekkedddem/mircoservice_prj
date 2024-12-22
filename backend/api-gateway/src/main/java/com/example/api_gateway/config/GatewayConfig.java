package com.example.api_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user_service", r -> r.path("/api/users/**")
                        .uri("http://localhost:8081"))
                .route("product_service", r -> r.path("/api/products/**")
                        .uri("http://localhost:8082"))
                .route("order_service", r -> r.path("/api/orders/**")
                        .uri("http://localhost:8083"))
                .build();
    }
}