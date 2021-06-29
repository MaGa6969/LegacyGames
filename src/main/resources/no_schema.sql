DROP TABLE IF EXISTS games;
CREATE TABLE games (
                       id   BIGSERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       platform VARCHAR(255) NOT NULL,
                       year INTEGER NOT NULL,
                       price DOUBLE PRECISION NOT NULL,
                       tag VARCHAR(255),
                       price_discount DOUBLE PRECISION,
                       category VARCHAR(255) NOT NULL,
                       publisher VARCHAR(255),
                       pegi VARCHAR(255),
                       photo VARCHAR(64) NOT NULL
);