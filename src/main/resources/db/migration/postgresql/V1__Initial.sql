CREATE TABLE app_info
(
    id    SMALLINT PRIMARY KEY,
    title VARCHAR(20)  NOT NULL,
    about VARCHAR(500) NOT NULL
);

CREATE SEQUENCE people_seq;

CREATE TABLE people
(
    id            BIGINT PRIMARY KEY,
    login         VARCHAR(20) NOT NULL,
    password      VARCHAR(50) NOT NULL,
    first_name    VARCHAR(30),
    last_name     VARCHAR(30),
    email         VARCHAR(50) NOT NULL,
    created_date  TIMESTAMP   NOT NULL DEFAULT current_timestamp,
    modified_date TIMESTAMP   NOT NULL DEFAULT current_timestamp,
    CONSTRAINT person_login_unq UNIQUE (login),
    CONSTRAINT person_email_unq UNIQUE (email),
    CONSTRAINT email_check CHECK (email ~ '^[A-Za-z0-9._+%-]+@[A-Za-z0-9.-]+[.][A-Za-z]+$')
);

CREATE SEQUENCE posts_seq;

CREATE TABLE posts
(
    id            BIGINT PRIMARY KEY,
    title         VARCHAR(200)  NOT NULL,
    introduction  VARCHAR(2000) NOT NULL,
    content       TEXT          NOT NULL,
    author_id     BIGINT        NOT NULL NOT NULL,
    created_date  TIMESTAMP     NOT NULL DEFAULT current_timestamp,
    modified_date TIMESTAMP     NOT NULL DEFAULT current_timestamp,
    CONSTRAINT post_person_fk FOREIGN KEY (author_id) REFERENCES people (id)
);
