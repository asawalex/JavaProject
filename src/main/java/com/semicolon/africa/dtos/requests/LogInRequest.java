package com.semicolon.africa.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LogInRequest {
    private String username;
    private String password;
}
