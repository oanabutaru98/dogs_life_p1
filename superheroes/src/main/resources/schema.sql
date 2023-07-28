drop table if exists heroes;
create table heroes (
    id int auto_increment primary key,
    name varchar(50) not null,
    alias varchar(50) not null,
    superPower varchar(70) not null,
    teamId int not null
);