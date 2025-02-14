package com.fourkites.demo.controller;

import com.fourkites.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserControllerTest {

    @Mock
    UserService userService;

    @InjectMocks
    UserController userController;


    @Test
    void getAllUsers() {

        when(userService.getAllUsers()).thenReturn(List.of("user1" , "user2", "user3"));

        List<String> allUsers = userController.getAllUsers();
        assertEquals(3, allUsers.size());

    }

    @Test
    void getSpecificUser() {
    }

    @Test
    void deleteUser() {
    }
}