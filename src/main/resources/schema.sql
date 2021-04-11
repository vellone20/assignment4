CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(15) UNIQUE NOT NULL,
    password VARCHAR(256) NOT NULL,
    first_name VARCHAR(15) NOT NULL,
    last_name VARCHAR(15) NOT NULL,
    date_of_birth DATE NOT NULL,
    email VARCHAR(50) NOT NULL

);

CREATE TABLE role (
    id INT AUTO_INCREMENT PRIMARY KEY,
    role_name VARCHAR(15) UNIQUE NOT NULL
);

CREATE TABLE user_role (
   user_id INT NOT NULL,
   role_id INT NOT NULL,

   PRIMARY KEY (user_id, role_id),
   FOREIGN KEY(user_id) REFERENCES user(id),
   FOREIGN KEY(role_id) REFERENCES role(id)
);

CREATE TABLE persistent_logins (
   username varchar(100) not null,
   series varchar(64) primary key,
   token varchar(64) not null,
   last_used timestamp not null
);
