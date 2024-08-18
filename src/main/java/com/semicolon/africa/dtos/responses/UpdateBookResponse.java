package com.semicolon.africa.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateBookResponse {
    private String title;
    private String author;
    private String isbn;
    private String message;
}
