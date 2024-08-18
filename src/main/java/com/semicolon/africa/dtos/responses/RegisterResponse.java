package com.semicolon.africa.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterResponse {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private String message;
}
