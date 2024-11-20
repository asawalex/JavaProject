package com.semicolon.africa.services;

import com.semicolon.africa.data.repositories.UserRepository;
import com.semicolon.africa.dto.requests.RegisterRequest;
import com.semicolon.africa.dto.responses.RegisterResponse;
import com.semicolon.africa.exception.UserDoesNotExitException;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private  UserRepository userRepository;

    @Override
    public RegisterResponse registerUser(RegisterRequest registerRequest) {

        User user = userRepository.findByUsernameAndPassword(registerRequest.getUserName(), registerRequest.getPassword());
        validateInformation(user.getPassword());
        validateInformation(user.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setUsername(registerRequest.getUserName());
        userRepository.save(user);
        RegisterResponse registerResponse = new RegisterResponse();
        registerResponse.setMessage("Successfully registered");

        return registerResponse;
    }

    private void validateInformation(String userInfo) {
        if(userInfo.isEmpty()){
            throw new UserDoesNotExitException("userName And password cannot be null");
        }
    }

}