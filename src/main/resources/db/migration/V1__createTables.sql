create table users
(
    id       bigint(20)   NOT NULL AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY UK_username (username)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

create table items
(
    id            bigint(20)   NOT NULL AUTO_INCREMENT,
    name          VARCHAR(255) NOT NULL,
    description   VARCHAR(255) NOT NULL,
    photoURL      VARCHAR(255) NOT NULL,
    startingPrice INTEGER      NOT NULL,
    purchasePrice INTEGER      NOT NULL,
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;