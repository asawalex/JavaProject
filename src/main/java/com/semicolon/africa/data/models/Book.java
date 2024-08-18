package com.semicolon.africa.data.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String isbn;
    private BookCategory category;
    private LocalDate create = LocalDate.now();
}
