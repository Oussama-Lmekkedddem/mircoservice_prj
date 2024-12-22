package com.example.api_gateway.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GatewayController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to the API Gateway!";
    }
}
