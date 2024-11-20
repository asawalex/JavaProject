package com.semicolon.africa.exception;

public class UserDoesNotExitException extends RuntimeException {
    public UserDoesNotExitException(String message) {
        super(message);
    }
}
