drop database library;
create database library;
use library;
create table book(
id int primary key,
name varchar(40),
author varchar(40),
NO_Of_Book int
);
describe book;
insert into book value(1,"leo","loki",2),(2,"PS","manirathnam",4),(3,"vada chennai","vetrimaran",5);
select * from  book;
create table logIn(
  id int primary key,
  user_name varchar(40),
  user_Id varchar(40),
  mo_number long,
  lib_id varchar(40)
);
insert into logIn values(1,"john","john@1033",9361734589,"LIB001");
insert into logIn values(2,"soundar","soundar@1045",1234567890,"LIB002");
describe logIn;
select * from logIn;
insert into book value(4,"aranmanai","sundar C",2);
create table usertakebook (
    user_Id varchar(15),
    user_ch1 varchar(40),
    user_ch2 varchar(40)
);
select * from logIn





