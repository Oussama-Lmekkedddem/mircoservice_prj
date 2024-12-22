package com.example.api_gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;


@RestController
public class RouteDebugController {

    @Autowired
    private RouteDefinitionLocator routeDefinitionLocator;

    @GetMapping("/debug/routes")
    public Object debugRoutes() {
        return routeDefinitionLocator.getRouteDefinitions().collectList().block();
    }
}
