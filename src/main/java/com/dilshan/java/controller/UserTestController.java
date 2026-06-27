package com.dilshan.java.controller;

import com.dilshan.java.modal.User;
import com.dilshan.java.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserTestController {

    private final UserService userService;

    public UserTestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/finUser/{id}")
    public User findUserById(@PathVariable Long id) {
        try {
            return userService.findUserById(id);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


}
