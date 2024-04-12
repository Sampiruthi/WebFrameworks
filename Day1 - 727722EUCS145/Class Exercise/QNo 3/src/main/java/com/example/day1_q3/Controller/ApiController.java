package com.example.day1_q3.Controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ApiController {
    @GetMapping("/favouriteColor")
    public String colour(@RequestParam String color){
        return "My favortie color is "+color+"!";
    }
}
