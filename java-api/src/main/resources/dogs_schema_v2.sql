CREATE TABLE owners(
    owner_id int auto_increment primary key,
    name varchar (100)
);

CREATE TABLE dogs (
    id int auto_increment primary key,
    name varchar (100) not null,
    age int not null,
    owner_id int not null,
    FOREIGN key (owner_id ) REFERENCES owners(owner_id)
);