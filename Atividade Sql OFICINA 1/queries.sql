CREATE TABLE mecanico(id_mecanico INT AUTO_INCREMENT,
nome_mecanico VARCHAR(50) NOT NULL,
CONSTRAINT pk_mecanico PRIMARY KEY (id_mecanico)
);

CREATE TABLE veiculos(id_veiculo INT AUTO_INCREMENT, 
modelo VARCHAR(50),
placa VARCHAR(8),
id_mecanico INT NOT NULL, 
CONSTRAINT pk_veiculo PRIMARY KEY (id_veiculo),
CONSTRAINT unk_placa UNIQUE (placa),
CONSTRAINT fk_veiculo_mecanico FOREIGN KEY (id_mecanico) 

  REFERENCES mecanico(id_mecanico)
  ON DELETE CASCADE
  ON UPDATE CASCADE

);

INSERT INTO mecanico(nome_mecanico) 
  VALUES ('Roberto Silva'),('Ana Paula');

INSERT INTO veiculos(modelo,placa,id_mecanico) 
  VALUES ('Gol','ABC-1234',1),('Civic','XYZ-9876',2);

ALTER TABLE veiculos MODIFY COLUMN id_mecanico INT NULL;

ALTER TABLE veiculos DROP FOREIGN KEY fk_veiculo_mecanico; 

ALTER TABLE veiculos
ADD CONSTRAINT fk_veiculo_mecanico
FOREIGN KEY(id_mecanico) REFERENCES mecanico(id_mecanico)
ON DELETE SET NULL
ON UPDATE CASCADE;

DELETE FROM mecanico 
  WHERE id_mecanico = 1;

UPDATE veiculos SET modelo = 'Gol 1.6' 
  WHERE id_veiculo = 1;

SELECT*FROM mecanico;
SELECT*FROM veiculos;