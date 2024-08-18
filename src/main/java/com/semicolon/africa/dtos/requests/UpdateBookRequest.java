package com.semicolon.africa.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateBookRequest {
    private String title;
    private String author;
    private String isbn;
}
