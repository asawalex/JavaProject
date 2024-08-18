package com.semicolon.africa.data.repositories;

import com.semicolon.africa.data.models.Staff;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends MongoRepository<Staff,String> {
}
