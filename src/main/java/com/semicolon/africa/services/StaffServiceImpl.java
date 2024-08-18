package com.semicolon.africa.services;

import com.semicolon.africa.data.models.Book;
import com.semicolon.africa.data.repositories.BookRepository;
import com.semicolon.africa.data.repositories.StaffRepository;
import com.semicolon.africa.dtos.requests.BookRecordRequest;
import com.semicolon.africa.dtos.responses.BookRecordResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private BookRepository bookRepository;


    @Override
    public BookRecordResponse addBookRecord(BookRecordRequest bookRecordRequest) {
            for (Book book : bookRepository.findAll()) {

            }
        return null;
    }
}
