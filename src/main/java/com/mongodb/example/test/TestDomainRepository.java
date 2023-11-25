package com.mongodb.example.test;

import com.mongodb.example.test.model.TestDomain;
import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.reactive.ReactorPageableRepository;
import org.bson.types.ObjectId;

@MongoRepository
public interface TestDomainRepository extends ReactorPageableRepository<TestDomain, ObjectId> {
}
