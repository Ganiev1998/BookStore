drop table if exists book cascade;
create table if not exists book(id serial primary key,name varchar,author varchar,publisher varchar);
