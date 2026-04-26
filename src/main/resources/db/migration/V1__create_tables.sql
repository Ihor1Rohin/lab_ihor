-- CREATE DATABASE uaplanes;

CREATE TABLE IF NOT EXISTS city (
                                    city_id SERIAL PRIMARY KEY,
                                    display_name VARCHAR(50) NOT NULL
    );

CREATE TABLE IF NOT EXISTS user_profile(
                                           user_profile_id SERIAL PRIMARY KEY,
                                           first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE
                             );

CREATE TABLE IF NOT EXISTS flight(
                                     flight_id SERIAL PRIMARY KEY,
                                     departure_city_id INTEGER REFERENCES city (city_id),
    arrival_city_id INTEGER REFERENCES city (city_id),
    departure_time TIMESTAMP WITH TIME ZONE,
    arrival_time TIMESTAMP WITH TIME ZONE,
    flight_number TEXT,
    price DOUBLE PRECISION,
    created_at TIMESTAMP WITH TIME ZONE
                             );

CREATE TABLE IF NOT EXISTS ticket(
                                     ticket_id SERIAL PRIMARY KEY,
                                     flight_id INTEGER REFERENCES flight (flight_id),
    user_profile_id INTEGER REFERENCES user_profile (user_profile_id),
    pnr VARCHAR(255) NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE
                             );