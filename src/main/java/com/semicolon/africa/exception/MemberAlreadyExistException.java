package com.semicolon.africa.exception;

public class MemberAlreadyExistException extends BookAlreadyExistException{
    public MemberAlreadyExistException(String message) {
        super(message);
    }
}
