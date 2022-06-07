DROP TABLE IF EXISTS job_club_user;

CREATE TABLE job_club_user (
  id int AUTO_INCREMENT PRIMARY KEY,
  first_name varchar(45) NOT NULL,
  last_name varchar(45) NOT NULL,
  username varchar(45) NOT NULL,
  password varchar(2000) not null
);
