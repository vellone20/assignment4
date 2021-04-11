INSERT INTO user
(first_name , last_name, email , date_of_birth, user_name, password)
VALUES
('Anthony', 'Vellone', 'vellone@sheridancollege.ca', '2000-05-19', 'anthony', '$2a$10$2AXC16.SP062SA9791x0XO/hWAfm4dJS1l/YJxB3LPcRXdNE/mv1y'),
('Johnny', 'ko', 'johnnyKo@gmail.com', '2000-06-24', 'johnny', '$2a$10$GtOwkR1ihB26gfDs.QDj/eH082GaeUGq2qFivCQ7AVibeSo7GCrXi'),
('Jess', 'Hida', 'jesshida@yahoo.ca', '2001-08-15', 'jess', '$2a$10$Ja6y46RtY9GEy85QpW8jueE8vBCBNGQvGveQcmaurKBRVfahhVOI2'),
('Daniella', 'Bot', 'daniellabot@hotmail.com', '2002-12-04', 'daniella', '$2a$10$/QMuzqG/eqqEtikI9HbWDe.IU8YytOLF61nvjCOkhWjzwwvAtmf8W'),
('Lucas', 'Rink', 'lucasrink@rogers.com', '1997-10-01', 'lucas', '$2a$10$EFoRynh0UbjrzJiRGETk5OozeVQIxrPCtCzDGQWG6v4CdHHzei71y'),
('Rick', 'Morty', 'rickmorty@outlook.com', '2005-01-29', 'rick', '$2a$10$jY21LHbyPEDiltXiiJv0FuZI9DEifNVFTTw5E4D9p/cjh.guqOkvm')      ;

/* all these passwords are "5k_&7Pm" */
INSERT INTO role
(role_name)
VALUES
('ROLE_TEACHER'),
('ROLE_STUDENT');

INSERT INTO user_role
(user_id, role_id)
VALUES
(1,1),
(2,1),
(3,1),
(4,2),
(5,2),
(6,2);
