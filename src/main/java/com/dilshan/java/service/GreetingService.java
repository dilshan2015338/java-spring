package com.dilshan.java.service;

import org.springframework.stereotype.Service;

@Service //Telling Spring that this is a service component, which can be injected into controllers or other services.
public class GreetingService {
    
    public String getGreeting(String name) {
        return "Hello, " + name + "! Welcome to Spring Boot.";
    }
}