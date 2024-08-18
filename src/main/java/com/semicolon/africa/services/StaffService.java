package com.semicolon.africa.services;

import com.semicolon.africa.dtos.requests.BookRecordRequest;
import com.semicolon.africa.dtos.responses.BookRecordResponse;
import org.springframework.stereotype.Service;

@Service
public interface StaffService {
    BookRecordResponse addBookRecord(BookRecordRequest bookRecordRequest);

}
