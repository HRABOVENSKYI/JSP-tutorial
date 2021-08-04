create database test_db;

use test_db;

create table users (
                       id bigint primary key auto_increment,
                       username varchar(255),
                       `password` varchar(255)
);

insert into users (username, `password`)
values
    ('nick', 'nick'),
    ('teo', 'teo'),
    ('jack', 'jack');

show tables;

select * from users;