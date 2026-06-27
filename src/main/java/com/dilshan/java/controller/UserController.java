//package com.dilshan.java.controller;
//
//import com.example.demo.entity.User;
//import com.example.demo.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/users")  // Base URL for all endpoints
//public class UserController {
//
//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    // GET /api/users - Get all users
//    @GetMapping  // "/api/users"
//    public ResponseEntity<List<User>> getAllUsers() {
//        List<User> users = userService.getAllUsers();
//        return ResponseEntity.ok(users);
//    }
//
//    // GET /api/users/{id} - Get user by ID
//    @GetMapping("/{id}") // "/api/users/56"
//    public ResponseEntity<User> getUserById(@PathVariable Long id) {
//        User user = userService.getUserById(id);
//        return ResponseEntity.ok(user);
//    }
//
//    // GET /api/users/email/{email} - Get user by email
//    @GetMapping("/email/{email}")  // "/api/users/email/dilshan@gmail.com"
//    public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
//        User user = userService.getUserByEmail(email);
//        return ResponseEntity.ok(user);
//    }
//
//    // GET /api/users/search?name=John - Search by name
//    @GetMapping("/search")
//    public ResponseEntity<List<User>> searchUsers(@RequestParam String name) {
//        List<User> users = userService.searchUsersByName(name);
//        return ResponseEntity.ok(users);
//    }
//
//    // GET /api/users/adults - Get users older than 18
//    @GetMapping("/adults")
//    public ResponseEntity<List<User>> getAdultUsers() {
//        List<User> users = userService.getUsersByMinAge(18);
//        return ResponseEntity.ok(users);
//    }
//
//    // POST /api/users - Create a new user
//    @PostMapping
//    public ResponseEntity<User> createUser(@RequestBody User user) {
//        User savedUser = userService.createUser(user);
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
//    }
//
//    // POST /api/users/bulk - Create multiple users
//    @PostMapping("/bulk")
//    public ResponseEntity<List<User>> createUsers(@RequestBody List<User> users) {
//        List<User> savedUsers = userService.createUsers(users);
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedUsers);
//    }
//
//    // PUT /api/users/{id} - Full update
//    @PutMapping("/{id}")
//    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
//        User updatedUser = userService.updateUser(id, user);
//        return ResponseEntity.ok(updatedUser);
//    }
//
//    // DELETE /api/users/{id} - Delete user
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
//        userService.deleteUser(id);
//        return ResponseEntity.noContent().build();  // 204 No Content
//    }
//
//    // DELETE /api/users - Delete all users
//    @DeleteMapping
//    public ResponseEntity<Void> deleteAllUsers() {
//        userService.deleteAllUsers();
//        return ResponseEntity.noContent().build();
//    }
//
//    // GET /api/users/count - Get total users
//    @GetMapping("/count")
//    public ResponseEntity<Long> getUserCount() {
//        long count = userService.countUsers();
//        return ResponseEntity.ok(count);
//    }
//}