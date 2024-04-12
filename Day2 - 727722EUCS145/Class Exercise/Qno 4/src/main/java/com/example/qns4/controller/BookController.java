package com.example.qns4.controller;

import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qns4.model.Book;

@RestController
public class BookController {
    @GetMapping("/book")
    public Book getmethod()
    {
        Book ob=new Book("The Great Soldier", "G. Gyan", new Data());
        return ob;
    }
}
