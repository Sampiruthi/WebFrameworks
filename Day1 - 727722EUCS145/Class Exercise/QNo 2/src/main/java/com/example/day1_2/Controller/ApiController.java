package com.example.day1_2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController {
@GetMapping("/studentName")
    public String Get(@RequestParam String studentName){
          return "Welcome "+studentName+"!";
    }
}
