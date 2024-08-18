package com.semicolon.africa.services;

import com.semicolon.africa.data.models.Member;
import com.semicolon.africa.data.repositories.MemberRepository;
import com.semicolon.africa.dtos.requests.LogInRequest;
import com.semicolon.africa.dtos.requests.RegisterRequest;
import com.semicolon.africa.dtos.responses.LogInResponse;
import com.semicolon.africa.dtos.responses.RegisterResponse;
import com.semicolon.africa.exception.MemberAlreadyExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberRepository memberRepository;


    @Override
    public RegisterResponse registerMember(RegisterRequest registerRequest) {
        RegisterResponse registerResponse = new RegisterResponse();

        for (Member member : memberRepository.findAll()) {
            if (member.getUsername().equals(registerRequest.getUsername()))
                throw new MemberAlreadyExistException("Username already exist");
        }
        Member member = new Member();
        member.setFirstName(registerRequest.getFirstName());
        member.setLastName(registerRequest.getLastName());
        member.setUsername(registerRequest.getUsername());
        member.setPassword(registerRequest.getPassword());
        member.setEmail(registerRequest.getEmail());
        memberRepository.save(member);

        registerResponse.setMessage("Successfully registered");
        return registerResponse;
    }


    @Override
    public LogInResponse logInMember(LogInRequest logInRequest) {
        LogInResponse logInResponse = new LogInResponse();
        for (Member member : memberRepository.findAll()) {
            if (member.getUsername().equals(logInRequest.getUsername()))
                throw new MemberAlreadyExistException("Username already exist");
        }
        Member member = new Member();
        member.setUsername(logInRequest.getUsername());
        member.setPassword(logInRequest.getPassword());
        memberRepository.save(member);

        logInResponse.setMessage("Successfully logged in");

        return logInResponse;
    }


}
