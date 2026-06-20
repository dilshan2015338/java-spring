package com.dilshan.java.controller;

import com.dilshan.java.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    
    private final GreetingService greetingService;
    
    // Constructor injection (recommended - final fields, easy testing)
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return greetingService.getGreeting(name);
    }
}