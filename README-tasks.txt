Task QL-2:

Task 2. Translating the model into a database

create table heroes /* creates a new table called heroes */
(
    name varchar (50) not null,             /* Adds field name that is a none-null varchar of length 50 */
    alias varchar (50) not null,            /* Adds field alias that is a none-null varchar of length 50 */
    superPower varchar (70) not null,       /* Adds field SuperPower that is a none-null varchar of length 70 */
    powerRanking int not null               /* Adds field powerRanking that is a none-null integer */
);  
