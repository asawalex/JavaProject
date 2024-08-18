package com.semicolon.africa.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BorrowBookRequest {
    private String id;
    private String title;
    private String author;
    private String isbn;
}
