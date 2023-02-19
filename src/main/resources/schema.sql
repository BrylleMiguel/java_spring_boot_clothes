CREATE TABLE IF NOT EXISTS clothe (
    id IDENTITY,
    name VARCHAR(30) NOT NULL,
    year_of_creation INT NOT NULL,
    price DOUBLE NOT NULL,
    brand VARCHAR(30) NOT NULL
);