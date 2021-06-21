DROP TABLE IF EXISTS game;
CREATE TABLE game (
                       id   BIGSERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       platform VARCHAR(255) NOT NULL,
                       year INTEGER NOT NULL,
                       price DOUBLE PRECISION NOT NULL,
                       etiqueta VARCHAR(255),
                       discount INTEGER,
                       price_discount DOUBLE PRECISION,
                       category VARCHAR(255) NOT NULL,
                       publisher VARCHAR(255),
                       pegi INTEGER,
                       pegi_descriptors VARCHAR(255),
                       photo VARCHAR(64) NOT NULL
);