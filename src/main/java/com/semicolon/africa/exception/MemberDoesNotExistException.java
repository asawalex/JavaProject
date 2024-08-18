package com.semicolon.africa.exception;

public class MemberDoesNotExistException extends MemberAlreadyExistException{
    public MemberDoesNotExistException(String message){
        super(message);
    }
}
