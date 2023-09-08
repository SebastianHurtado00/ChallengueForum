CREATE TABLE topico (
  id BIGINT NOT NULL AUTO_INCREMENT,
  titulo VARCHAR(255) NOT NULL unique,
  mensaje VARCHAR(255) NOT NULL unique,
  fechaCreacion DATE NOT NULL,
  estatus VARCHAR(20) NOT NULL,
  autor VARCHAR(255) NOT NULL,
  curso VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);
