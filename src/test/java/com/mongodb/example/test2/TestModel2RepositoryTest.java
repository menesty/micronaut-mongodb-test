package com.mongodb.example.test2;

import com.mongodb.example.AbstractIntegrationTest;
import com.mongodb.example.test.TestDomainRepository;
import com.mongodb.example.test.model.TestDomain;
import com.mongodb.example.test.model.TestDomainStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest(transactional = false)
class TestModel2RepositoryTest extends AbstractIntegrationTest {
    @Inject
    private TestDomainRepository testDomainRepository;

    @Test
    void testSaveModel() {
        TestDomain model = testDomainRepository.save(TestDomain.builder()
                .name(UUID.randomUUID().toString())
                .status(TestDomainStatus.ACTIVE)
                .quantity(10)
                .build()).block();
        assertNotNull(model);
        assertNotNull(model.getId());

    }
}
