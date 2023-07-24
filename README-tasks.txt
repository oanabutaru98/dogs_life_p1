Task QL-2:

Task 2. Translating the model into a database

create table heroes /* creates a new table called heroes */
(
    name varchar (50) not null,             /* Adds field name that is a none-null varchar of length 50 */
    alias varchar (50) not null,            /* Adds field alias that is a none-null varchar of length 50 */
    superPower varchar (70) not null,       /* Adds field SuperPower that is a none-null varchar of length 70 */
    powerRanking int not null               /* Adds field powerRanking that is a none-null integer */
); 

Task QL-3:

Task 1. Inserting data

INSERT into heroes
    (name, alias, superPower, powerRanking)
values
    ('Bruce Wayne', 'Batman', 'Martial Arts', 3),
    ('Clark Kent', 'Superman', 'Flight', 5),
    ('Jay Garrick', 'The Flash', 'Super-speed', 3),
    ('Alan Scott', 'Green Lantern', 'Ring Creation', 4),
    ('Helena Bertenelli', 'The Huntress', 'Crossbow Archery', 3),
    ('Dr. Harleen Quinzel', 'Harley Quinn', 'Hammer-fighting', 3),
    ('Floyd Lawton', 'Deadshot', 'Marksmaship', 2),
    ('Cecil Adams', 'Count Vertigo', 'Drug-dealing', 2),
    ('Damian Wayne', 'Robin', 'Swordsmanship', 2),
    ('Dick Grayson', 'Nightwing', 'Acrobatics', 3)
;

Task QL-5:

create table teams
(
    id int auto_increment PRIMARY KEY,
    name varchar (50) not null,
    objectives varchar (100) not null
);

create table heroes /* creates a new table called heroes */
(
    id int AUTO_INCREMENT PRIMARY KEY,            /* Adds field id that is an integer that auto increments and PK */
    name varchar (50) not null,                   /* Adds field name that is a none-null varchar of length 50 */
    alias varchar (50) not null,                  /* Adds field alias that is a none-null varchar of length 50 */
    superPower varchar (70) not null,             /* Adds field SuperPower that is a none-null varchar of length 70 */
    powerRanking int not null,
    team_id int not null,                         /* Adds TeamID name that is a none-null int */
    FOREIGN key (team_id) REFERENCES teams (id)   /* Makes a reference to the field id in the team table as TeamID is a foreign key */
);  


 ('JSA', 'Defeat the Nazis'),
    ('Birds of Prey', 'Fight crime(without men)'),
    ('Task Force X', 'Follow Waller\''s orders or die'),
    ('Teen Titans', 'Teach young superheroes to be their best'),
    ('Wayne Family', 'Protect the legacy of the Wayne name');


 ('Bruce Wayne', 'Batman', 'Martial Arts', 3, 1),
    ('Clark Kent', 'Superman', 'Flight', 5, 1),
    ('Jay Garrick', 'The Flash', 'Super-speed', 3, 2),
    ('Alan Scott', 'Green Lantern', 'Ring Creation', 4, 2),
    ('Helena Bertenelli', 'The Huntress', 'Crossbow Archery', 3, 3),
    ('Dr. Harleen Quinzel', 'Harley Quinn', 'Hammer-fighting', 3, 3),
    ('Floyd Lawton', 'Deadshot', 'Marksmaship', 2, 4),
    ('Cecil Adams', 'Count Vertigo', 'Drug-dealing', 2, 4),
    ('Damian Wayne', 'Robin', 'Swordsmanship', 2, 5),
    ('Dick Grayson', 'Nightwing', 'Acrobatics', 3, 5)


 
