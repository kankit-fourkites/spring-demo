package com.fourkites.demo.controller;


import com.fourkites.demo.service.UserService;
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
    public List<String> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public String getSpecificUser(@PathVariable String id) {
        return userService.getSpecificUser(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id) {
        return userService.deleteUser(id);
    }
}
