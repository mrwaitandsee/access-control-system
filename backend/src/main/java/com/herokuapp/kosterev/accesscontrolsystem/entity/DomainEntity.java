package com.herokuapp.kosterev.accesscontrolsystem.entity;

import lombok.Getter;

import java.util.UUID;

@Getter
public class DomainEntity extends BaseEntity {
    private final String name;

    public DomainEntity(
            UUID id,
            String name
    ) {
        super(id);
        this.name = name;
    }
}
