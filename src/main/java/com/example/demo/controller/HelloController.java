package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


//each controller handles a specific route or set of routes in the application.
@RestController
public class HelloController {
    @GetMapping("/hello") // Mapping for HTTP GET requests to /hello
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name); //Response is a greeting message
    }
    
}
