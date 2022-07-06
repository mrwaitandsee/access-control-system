package com.herokuapp.kosterev.accesscontrolsystem.entity;

import lombok.Getter;

import java.util.UUID;

@Getter
public class SecretEntity extends BaseEntity {
    private final String question;
    private final String answer;
    private final UUID accountEntityId;

    public SecretEntity(
            UUID id,
            String question,
            String answer,
            UUID accountEntityId
    ) {
        super(id);
        this.question = question;
        this.answer = answer;
        this.accountEntityId = accountEntityId;
    }
}
