drop table if exists permission cascade ;
create table permission(id serial primary key ,name varchar);
insert into permission values (1,'create book'),(2,'read book'),(3,'update book'),(4,'delete book');