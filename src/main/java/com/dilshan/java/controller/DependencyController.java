package com.dilshan.java.controller;

import com.dilshan.java.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DependencyController {

//    // Field injection (not recommended - hard to test)
//    @Autowired
//    private GreetingService greetingVariable; // Injecting the GreetingService dependency

//    private GreetingService greetingVariable;
//
//    // Setter injection (rarely used)
//    @Autowired
//    public void setGreetingService(GreetingService greetingService) {
//        System.out.println("Setter injection: Setting GreetingService dependency.");
//        this.greetingVariable = greetingService;
//    }

    //Constructor injection (recommended - final fields, easy testing)
    private final GreetingService greetingVariable;

    public DependencyController(GreetingService greetingService) {
        this.greetingVariable = greetingService;
    }


    @GetMapping("/dependency/{name}")
    public String dependencyExample(@PathVariable String name) {
        return greetingVariable.getGreeting(name); // Using the injected service to get a greeting message
    }


}
