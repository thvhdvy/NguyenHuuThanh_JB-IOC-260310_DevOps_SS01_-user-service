package com.thanhnguyen.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of("service", "user-service", "status", "UP");
    }

}
