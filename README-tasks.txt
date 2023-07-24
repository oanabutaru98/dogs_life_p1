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
