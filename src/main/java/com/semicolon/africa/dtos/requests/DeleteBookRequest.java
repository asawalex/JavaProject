package com.semicolon.africa.dtos.requests;


import lombok.Data;

@Data
public class DeleteBookRequest {
    private String isbn;
    private String title;
}
