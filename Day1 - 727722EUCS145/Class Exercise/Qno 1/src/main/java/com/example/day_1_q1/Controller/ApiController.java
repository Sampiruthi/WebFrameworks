package com.example.day_1_q1.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ApiController {
    @GetMapping("/welcome")
    public String getMethodName() {
        return "Welcome Spring Boot!";
    }
}
