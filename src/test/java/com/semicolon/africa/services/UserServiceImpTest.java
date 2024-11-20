package com.semicolon.africa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImpTest {


    //@Autowired
    private final UserService userService;

    UserServiceImpTest(UserService userService) {
        this.userService = userService;
    }
}