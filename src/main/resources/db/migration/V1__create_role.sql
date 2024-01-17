drop table if exists role cascade;
create table role(id serial primary key ,name varchar);
insert into role(name) values ('admin'),('user');
