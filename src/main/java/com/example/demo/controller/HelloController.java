package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


//each controller handles a specific route or set of routes in the application.
@RestController
public class HelloController {
    @PostMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
    
}
