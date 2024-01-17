drop table if exists users cascade;
create table if not exists users(id serial primary key ,userName varchar,password varchar,role_id int references role(id));
insert into users(userName, password, role_id) VALUES ('Alan','1234',1);