package com.semicolon.africa.data.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Document
@Data
public class Staff {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
