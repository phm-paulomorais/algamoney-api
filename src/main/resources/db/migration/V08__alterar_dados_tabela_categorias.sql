DELETE FROM lancamento WHERE codigo_categoria=4;
DELETE FROM categoria WHERE nome='Farmácia';

INSERT INTO categoria (nome) values ('Transporte');
INSERT INTO categoria (nome) values ('Casa');
INSERT INTO categoria (nome) values ('Educação');
INSERT INTO categoria (nome) values ('Comunicação');
INSERT INTO categoria (nome) values ('Saúde');