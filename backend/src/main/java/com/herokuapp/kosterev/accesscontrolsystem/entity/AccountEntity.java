package com.herokuapp.kosterev.accesscontrolsystem.entity;

import lombok.Getter;

import java.util.UUID;

@Getter
public class AccountEntity extends BaseEntity {
    private final String name;
    private final String password;
    private final UUID domainEntityId;

    public AccountEntity(
            UUID id,
            String name,
            String password,
            UUID domainEntityId
    ) {
        super(id);
        this.name = name;
        this.password = password;
        this.domainEntityId = domainEntityId;
    }
}
