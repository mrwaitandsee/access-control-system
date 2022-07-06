CREATE TABLE AccountEntity (
    id             UUID NOT NULL,
    name           TEXT NOT NULL,
    password       TEXT NOT NULL,
    domainEntityId UUID NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (domainEntityId) REFERENCES DomainEntity(id)
);