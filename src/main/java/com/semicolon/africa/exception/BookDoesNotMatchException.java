package com.semicolon.africa.exception;

public class BookDoesNotMatchException extends BookDoesNotExistException{
    public BookDoesNotMatchException(String massage){
        super(massage);
    }
}
