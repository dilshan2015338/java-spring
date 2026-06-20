package com.dilshan.java.controller;

import com.dilshan.java.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    
    private final GreetingService greetingService;

    //Dependency injection (DI) is a design pattern used in software development to achieve Inversion
    // of Control (IoC) between classes and their dependencies. Instead of a class creating its own dependencies,
    // they are provided to the class from an external source, typically through constructors, setters, or interfaces.
    // This promotes loose coupling, easier testing, and better maintainability of code.
    // Constructor injection (recommended - final fields, easy testing)
    public GreetingController(GreetingService greetingService) {
        System.out.println("Constructor injection: GreetingController is being created with GreetingService dependency.");
        this.greetingService = greetingService;
    }
    
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        System.out.println("Received request to greet: " + name);
        return greetingService.getGreeting(name);
    }

    @GetMapping("/greet2/{name}")
    public String greet2(@PathVariable String name) {
        return greetingService.getGreeting(name);
    }
}