CREATE TABLE SecretEntity (
    id              UUID NOT NULL,
    question        TEXT NOT NULL,
    answer          TEXT NOT NULL,
    accountEntityId UUID NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (accountEntityId) REFERENCES AccountEntity(id)
);