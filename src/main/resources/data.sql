DROP TABLE IF EXISTS job_club_user;

CREATE TABLE job_club_user (
  id int AUTO_INCREMENT PRIMARY KEY,
  first_name varchar(45) NOT NULL,
  last_name varchar(45) NOT NULL,
  username varchar(45) NOT NULL,
  password varchar(2000) not null
);

insert into job_club_user (first_name, last_name, username, password)
values ('Reza', 'Ahmadi', 'rezacomplete@gmail.com', '12345678');