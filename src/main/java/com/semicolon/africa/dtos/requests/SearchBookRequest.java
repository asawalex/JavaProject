package com.semicolon.africa.dtos.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class SearchBookRequest {
    private String id;
    private String title;
}
