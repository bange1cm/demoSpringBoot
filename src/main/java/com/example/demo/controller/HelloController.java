package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//each controller handles a specific route or set of routes in the application.
@RestController
public class HelloController {
    @GetMapping("/hello") // Mapping for HTTP GET requests to /hello
    public String hello() { 
      return "Hello World!"; // Response is a greeting message
    }
    
}
