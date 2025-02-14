package com.fourkites.demo.controller;


import com.fourkites.demo.entity.User;
import com.fourkites.demo.service.UserService;
import io.swagger.v3.oas.annotations.headers.Header;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getSpecificUser(@PathVariable String id) {
        return userService.getSpecificUser(id);
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        return userService.deleteUser(id);
    }
}
