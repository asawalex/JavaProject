package com.semicolon.africa.services;

import com.semicolon.africa.dto.requests.RegisterRequest;
import com.semicolon.africa.dto.responses.RegisterResponse;



public interface UserService {
    RegisterResponse  registerUser(RegisterRequest registerRequest);

}
