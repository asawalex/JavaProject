package com.semicolon.africa.exception;

public class BookNotAvailableException extends BookAlreadyExistException{
    public BookNotAvailableException(String message){
        super(message);
    }
}
