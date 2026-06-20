package com.dilshan.java.controller;

import com.dilshan.java.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // = @Controller + @ResponseBody (returns JSON by default)
public class HelloController {

    private final GreetingService greetingService;

    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        greetingService.getGreeting("User"); // Example usage of the service
        return "Hello, Spring boot!";
    }

    @GetMapping("/api/info")
    public AppInfo getAppInfo() {
        return new AppInfo("Demo App", "1.0.0");
    }

    public static class AppInfo {
        private String name;
        private String version;

        public AppInfo(String name, String version) {
            this.name = name;
            this.version = version;
        }

        public String getName() {
            return name;
        }

        public String getVersion() {
            return version;
        }
    }
}
