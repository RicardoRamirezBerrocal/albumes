
CREATE DATABASE gestion_albumes;

USE gestion_albumes;

CREATE TABLE albumes (
    alb_codalb INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    alb_anyo INT UNSIGNED NOT NULL,
    alb_titulo VARCHAR(50) NOT NULL,
    alb_artista VARCHAR(50) NOT NULL,
    alb_tipo VARCHAR(50) NOT NULL,
    alb_estrellas DOUBLE UNSIGNED NOT NULL,
    alb_ediciones INT UNSIGNED NOT NULL,
    alb_votos INT UNSIGNED NOT NULL
);
