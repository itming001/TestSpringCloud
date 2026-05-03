package com.lecturer.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRouteConfig {

    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service-route", r -> r.path("/api/user/**")
                        .filters(f -> f.stripPrefix(1).addRequestHeader("X-Gateway", "lecturer-gateway"))
                        .uri("lb://user-service"))
                .route("order-service-route", r -> r.path("/api/order/**")
                        .filters(f -> f.stripPrefix(1).addRequestParameter("source", "gateway"))
                        .uri("lb://order-service"))
                .build();
    }
}
