CREATE TABLE app_info
(
    id    SMALLINT PRIMARY KEY,
    title VARCHAR(20)  NOT NULL,
    about VARCHAR(500) NOT NULL
);

CREATE SEQUENCE people_seq;

CREATE TABLE people
(
    id         BIGINT PRIMARY KEY,
    login      VARCHAR(20) NOT NULL,
    password   VARCHAR(50) NOT NULL,
    first_name VARCHAR(30) NOT NULL,
    last_name  VARCHAR(30) NOT NULL,
    email      VARCHAR(50) NOT NULL,
    CONSTRAINT person_login_unq UNIQUE (login),
    CONSTRAINT person_email_unq UNIQUE (email)
);

CREATE SEQUENCE posts_seq;

CREATE TABLE posts
(
    id            BIGINT PRIMARY KEY,
    title         VARCHAR(200)  NOT NULL,
    introduction  VARCHAR(2000) NOT NULL,
    content       MEDIUMTEXT    NOT NULL,
    author_id     BIGINT        NOT NULL,
    creation_date TIMESTAMP     NOT NULL,
    CONSTRAINT post_person_fk FOREIGN KEY (author_id) REFERENCES people (id)
);
