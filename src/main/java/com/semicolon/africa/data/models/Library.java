package com.semicolon.africa.data.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document
public class Library {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    @DBRef
    private List<Member> member;
}
