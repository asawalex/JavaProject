package com.semicolon.africa.data.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Document
@Data
public class Member {
    @Id
    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @DBRef
    private List<Book> books;

}
