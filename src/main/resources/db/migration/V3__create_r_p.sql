drop table if exists role_permission cascade;
create table if not exists role_permission(id serial primary key ,role_id int references role(id),
    permission_id int references permission(id),unique (role_id,permission_id));
insert into role_permission values (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,2,2);