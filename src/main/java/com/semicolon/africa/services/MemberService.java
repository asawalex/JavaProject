package com.semicolon.africa.services;

import com.semicolon.africa.dtos.requests.LogInRequest;
import com.semicolon.africa.dtos.requests.RegisterRequest;
import com.semicolon.africa.dtos.requests.ReturnBookRequest;
import com.semicolon.africa.dtos.responses.LogInResponse;
import com.semicolon.africa.dtos.responses.RegisterResponse;
import com.semicolon.africa.dtos.responses.ReturnBookResponse;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    RegisterResponse registerMember(RegisterRequest registerRequest);
    LogInResponse logInMember(LogInRequest logInRequest);
}
