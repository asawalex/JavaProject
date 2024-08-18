package com.semicolon.africa.exception;

public class BookDoesNotExistException extends BookAlreadyExistException{
    public BookDoesNotExistException(String massage){
        super(massage);
    }
}
