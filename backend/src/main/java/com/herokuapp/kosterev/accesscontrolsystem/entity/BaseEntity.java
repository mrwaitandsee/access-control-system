package com.herokuapp.kosterev.accesscontrolsystem.entity;

import lombok.Getter;

import java.util.UUID;

@Getter
public class BaseEntity {
    private final UUID id;

    public BaseEntity(UUID id) {
        this.id = id;
    }
}
