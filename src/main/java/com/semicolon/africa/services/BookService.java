package com.semicolon.africa.services;

import com.semicolon.africa.dtos.requests.*;
import com.semicolon.africa.dtos.responses.*;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
    AddBookResponse addBook(AddBookRequest request);

    DeleteBookResponse deleteBook(DeleteBookRequest request);

    BorrowBookResponse borrowBook(BorrowBookRequest request);

    UpdateBookResponse updateBook(UpdateBookRequest request);

    SearchBookResponse searchBook(SearchBookRequest request);
}
