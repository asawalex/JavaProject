package com.semicolon.africa.dtos.responses;

import com.semicolon.africa.data.models.BookCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddBookResponse {
    private String id;
    private String title;
    private String author;
    private String isbn;
    private BookCategory Category;
    private String message;
}
