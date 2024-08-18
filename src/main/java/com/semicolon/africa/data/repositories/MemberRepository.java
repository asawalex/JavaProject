package com.semicolon.africa.data.repositories;

import com.semicolon.africa.data.models.Member;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends MongoRepository<Member, String> {
    Member findByEmail(String email);

}

