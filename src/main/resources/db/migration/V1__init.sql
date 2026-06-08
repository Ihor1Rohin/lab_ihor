CREATE TABLE IF NOT EXISTS city (
    city_id SERIAL PRIMARY KEY,
    display_name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS roles (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS user_profile (
    user_profile_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE
);

CREATE TABLE IF NOT EXISTS users_roles (
    user_id INTEGER NOT NULL REFERENCES user_profile(user_profile_id),
    role_id BIGINT NOT NULL REFERENCES roles(id),
    PRIMARY KEY (user_id, role_id)
);

CREATE TABLE IF NOT EXISTS flight (
    flight_id SERIAL PRIMARY KEY,
    departure_city_id INTEGER REFERENCES city(city_id),
    arrival_city_id INTEGER REFERENCES city(city_id),
    departure_time TIMESTAMP WITH TIME ZONE,
    arrival_time TIMESTAMP WITH TIME ZONE,
    flight_number TEXT,
    price DOUBLE PRECISION,
    created_at TIMESTAMP WITH TIME ZONE
);

CREATE TABLE IF NOT EXISTS ticket (
    ticket_id SERIAL PRIMARY KEY,
    flight_id INTEGER REFERENCES flight(flight_id),
    user_profile_id INTEGER REFERENCES user_profile(user_profile_id),
    pnr VARCHAR(255) NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE
);

INSERT INTO roles (name) VALUES
('ROLE_ADMIN'),
('ROLE_USER');

INSERT INTO user_profile (first_name, last_name, username, password, created_at)
VALUES
('Admin', 'Admin', 'admin', '$2a$10$Dow1dnJ1P7S4sljdYz7IjeLzSXKekA06xBDvmQenwviHLo49gJR2y', now()),
('User', 'User', 'user', '$2a$10$Dow1dnJ1P7S4sljdYz7IjeLzSXKekA06xBDvmQenwviHLo49gJR2y', now());

INSERT INTO users_roles (user_id, role_id)
VALUES
(1, 1),
(2, 2);

INSERT INTO city (display_name) VALUES
('Alabama'),
('Odesa'),
('Vorokhta');

INSERT INTO flight (departure_city_id, arrival_city_id, departure_time, arrival_time, flight_number, price, created_at)
VALUES
(1, 2, '2023-04-23 22:23:54+02', '2023-04-23 22:23:54+02', '1235', 55.23, now()),
(2, 3, '2023-05-19 14:23:54+02', '2023-05-20 08:02:42+02', '1337', 250.53, now());
