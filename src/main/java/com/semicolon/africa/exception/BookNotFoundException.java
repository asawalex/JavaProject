package com.semicolon.africa.exception;

public class BookNotFoundException extends BookAlreadyExistException{
    public BookNotFoundException(String massage) {
        super(massage);

    }
}
