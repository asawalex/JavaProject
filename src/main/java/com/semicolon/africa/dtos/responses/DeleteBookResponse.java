package com.semicolon.africa.dtos.responses;

import lombok.Data;

@Data
public class DeleteBookResponse {
    private String isbn;
    private String title;
    private String message;
}
