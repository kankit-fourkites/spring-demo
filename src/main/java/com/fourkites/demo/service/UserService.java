package com.fourkites.demo.service;

import com.fourkites.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers() {


        User user1 = User.builder().id("1").name("user1").build();

        User user2 = User.builder().id("2").build();

        User user3 = User.builder().id("3").name("user3").email("myemail@email.com").password("password").build();



        return List.of(user1, user2, user3);
    }

    public User getSpecificUser(String id) {
        return User.builder().id(id).name("user3").email("myemail@email.com").password("password").build();
    }

    public String deleteUser(String id) {
        System.out.println("Deleted user with id: " + id);
        return "Deleted user with id: " + id;
    }

    public User addUser(User user) {
        //todo: add user to the database
        return user;
    }
}
