package com.semicolon.africa.data.repositories;

import com.semicolon.africa.data.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
   Book findBookByIsbn(String isbn);
}
