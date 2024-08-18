package com.semicolon.africa.services;

import com.semicolon.africa.data.models.Book;
import com.semicolon.africa.data.repositories.BookRepository;
import com.semicolon.africa.dtos.requests.*;
import com.semicolon.africa.dtos.responses.*;
import com.semicolon.africa.exception.BookAlreadyExistException;
import com.semicolon.africa.exception.BookNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Random;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public AddBookResponse addBook(AddBookRequest request) {
        AddBookResponse addBookResponse = new AddBookResponse();

        for(Book books : bookRepository.findAll()) {
            if (books.getId().equals(request.getId()))
                throw new BookAlreadyExistException("Book already exist");
        }

        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setIsbn(randomNumber());
        book.setCategory(request.getCategory());
        bookRepository.save(book);

        addBookResponse.setTitle(request.getTitle());
        addBookResponse.setAuthor(request.getAuthor());
        addBookResponse.setIsbn(request.getIsbn());
        addBookResponse.setCategory(request.getCategory());
        addBookResponse.setMessage("Book added successfully");
        return addBookResponse;
    }

    @Override
    public DeleteBookResponse deleteBook(DeleteBookRequest request) {
        DeleteBookResponse deleteBookResponse = new DeleteBookResponse();

        Book book = bookRepository.findBookByIsbn(request.getIsbn());
        if (!book.getTitle().equals(request.getTitle()))
            if(!book.getIsbn().equals(request.getIsbn()))
            throw new BookNotFoundException("Book does not exist");

        bookRepository.delete(book);

        deleteBookResponse.setMessage("Book deleted successfully");
        return deleteBookResponse;
    }

    @Override
    public BorrowBookResponse borrowBook(BorrowBookRequest request) {
        BorrowBookResponse borrowBookResponse = new BorrowBookResponse();

        for(Book books : bookRepository.findAll()) {
            if(!books.getTitle().equals(request.getTitle()))
               if(!books.getId().equals(request.getIsbn()))
                   throw new BookNotFoundException("Book does not exist");
        }
        bookRepository.delete(bookRepository.findBookByIsbn(request.getIsbn()));

        borrowBookResponse.setTitle(request.getTitle());
        borrowBookResponse.setIsbn(request.getIsbn());
        borrowBookResponse.setAuthor(request.getAuthor());
        borrowBookResponse.setMessage("Book borrowed successfully");

        return borrowBookResponse;
    }


    @Override
    public UpdateBookResponse updateBook(UpdateBookRequest request) {
        UpdateBookResponse updateBookResponse = new UpdateBookResponse();

        for(Book books : bookRepository.findAll()) {
            if(books.getTitle().equals(request.getTitle()))
                if(books.getId().equals(request.getIsbn()))
                    throw new BookAlreadyExistException("Book already exist");
        }
        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setIsbn(request.getIsbn());
        bookRepository.save(book);

        updateBookResponse.setTitle(request.getTitle());
        updateBookResponse.setAuthor(request.getAuthor());
        updateBookResponse.setIsbn(request.getIsbn());
        updateBookResponse.setMessage("Book updated successfully");

        return updateBookResponse;
    }


    @Override
    public SearchBookResponse searchBook(SearchBookRequest request) {
        SearchBookResponse searchBookResponse = new SearchBookResponse();

        for(Book book : bookRepository.findAll()) {
            if(!book.getTitle().equals(request.getTitle()))
                if(!book.getId().equals(request.getId()))
                    throw new BookNotFoundException("Book does not exist");
        }
            Book book = new Book();
            book.setTitle(request.getTitle());
            book.setId(request.getId());
            bookRepository.save(book);

            searchBookResponse.setTitle(request.getTitle());

        return searchBookResponse;
    }


    private static String randomNumber(){
        Random rand = new Random();
        return STR."\{rand.nextInt(1000000000) + 1}isbn";
    }
}




