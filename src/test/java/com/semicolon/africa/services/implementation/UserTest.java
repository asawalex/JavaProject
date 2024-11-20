//package com.semicolon.africa.services.implementation;
//
//import com.semicolon.africa.dto.requests.RegisterRequest;
//import com.semicolon.africa.dto.responses.RegisterResponse;
//import com.semicolon.africa.services.UserService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//@SpringBootTest
////@AllArgsConstructor
//public class UserTest {
//
//    @Autowired
//   private UserService userService;
//
//    @Test
//    public void testThatUserCanRegister() {
//        RegisterRequest registerRequest = new RegisterRequest();
//        registerRequest.setUserName("wale");
//        registerRequest.setPassword("123456");
//        RegisterResponse response = userService.registerUser(registerRequest);
//        assertEquals("Successfully registered",response.getMessage());
//
//    }
//}
