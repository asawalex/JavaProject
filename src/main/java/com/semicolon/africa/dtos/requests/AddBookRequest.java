package com.semicolon.africa.dtos.requests;

import com.semicolon.africa.data.models.BookCategory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddBookRequest {
    private String id;
    private String title;
    private String author;
    private String isbn;
    private BookCategory category;

}
