package com.appranch.appranch.repositories;

import com.appranch.appranch.documents.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<UserDocument, Long> {
    @Override
    List<UserDocument> findAll();

    @Override
    UserDocument save(UserDocument userDocument);
}
