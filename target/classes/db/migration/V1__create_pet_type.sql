CREATE TABLE pet_types (
    id SERIAL PRIMARY KEY,
    type VARCHAR NOT NULL,
    description VARCHAR,
    image_url VARCHAR NOT NULL
);
