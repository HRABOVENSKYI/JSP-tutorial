-- run app on localhost:8080/profile.jsp
-- run these MySQL commands to generate required data

create
database if not exists test_db;

create table student
(
    id     bigint primary key auto_increment,
    `name` varchar(255),
    marks  int
);

insert into student (id, `name`, marks)
values (103, "teo", 55);