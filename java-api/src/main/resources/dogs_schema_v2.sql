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

CREATE VIEW dogs_and_owners AS
    select d.name as "Dog Name", d.age as "Dog Age", o.name as "Owner Name"
      from dogs as d join owners as o on
    d.owner_id = o.owner_id;

SELECT * FROM dogs_and_owners;