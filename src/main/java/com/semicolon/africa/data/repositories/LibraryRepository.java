package com.semicolon.africa.data.repositories;

import com.semicolon.africa.data.models.Library;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends MongoRepository<Library, String> {
}
