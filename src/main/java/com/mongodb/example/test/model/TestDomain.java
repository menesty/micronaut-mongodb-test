package com.mongodb.example.test.model;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;

@Builder
@Data
@Introspected
@MappedEntity("power_bank")
public class TestDomain {
    @Id
    private ObjectId id;
    @NotNull
    private String name;
    @NotNull
    private TestDomainStatus status;
    private int quantity;
}
