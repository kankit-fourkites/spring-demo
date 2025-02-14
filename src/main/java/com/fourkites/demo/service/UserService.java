package com.fourkites.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<String> getAllUsers() {
        return List.of("user1" , "user2", "user3");
    }

    public String getSpecificUser(String id) {
        return "user-" + id;
    }

    public String deleteUser(String id) {
        System.out.println("Deleted user with id: " + id);
        return "Deleted user with id: " + id;
    }
}
