CREATE TABLE categoria (
  id_categoria INT AUTO_INCREMENT,
  nome_categoria VARCHAR(50) NOT NULL, 
  CONSTRAINT pk_categoria PRIMARY KEY(id_categoria)
);

CREATE TABLE cliente (
  id_cliente INT AUTO_INCREMENT,
  nome VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  telefone VARCHAR(20) NOT NULL,
  CONSTRAINT pk_cliente PRIMARY KEY(id_cliente) 
);

CREATE TABLE vendedor (
  id_vendedor INT AUTO_INCREMENT, 
  nome VARCHAR(50) NOT NULL,
  comissao DECIMAL(10,2) NOT NULL,
  CONSTRAINT pk_vendedor PRIMARY KEY(id_vendedor) 
);

CREATE TABLE produto (
  id_produto INT AUTO_INCREMENT,
  nome_compra VARCHAR(100) NOT NULL,
  preco DECIMAL(10,2) NOT NULL, 
  id_categoria INT NOT NULL,
  CONSTRAINT pk_produto PRIMARY KEY (id_produto),
  CONSTRAINT fk_produto_categoria FOREIGN KEY (id_categoria)
    REFERENCES categoria(id_categoria) 
);

CREATE TABLE pedido (
  id_pedido INT AUTO_INCREMENT,
  data_pedido DATE NOT NULL,
  id_cliente INT NOT NULL,
  id_vendedor INT NOT NULL,
  CONSTRAINT pk_pedido PRIMARY KEY (id_pedido),
  CONSTRAINT fk_pedido_cliente FOREIGN KEY(id_cliente)
    REFERENCES cliente (id_cliente),
  CONSTRAINT fk_pedido_vendedor FOREIGN KEY (id_vendedor) 
    REFERENCES vendedor(id_vendedor)
);

CREATE TABLE item_pedido (
  id_item INT AUTO_INCREMENT,
  id_pedido INT NOT NULL,
  id_produto INT NOT NULL,
  quantidade INT NOT NULL,
  preco_unitario DECIMAL(10,2) NOT NULL,
  CONSTRAINT pk_item_pedido PRIMARY KEY (id_item),
  CONSTRAINT fk_item_pedido_pedido FOREIGN KEY (id_pedido)
    REFERENCES pedido(id_pedido), 
  CONSTRAINT fk_item_pedido_produto FOREIGN KEY(id_produto) 
    REFERENCES produto (id_produto)
);

INSERT INTO categoria (nome_categoria) VALUES ('Eletronico');
INSERT INTO categoria (nome_categoria) VALUES ('Jogos');
INSERT INTO categoria (nome_categoria) VALUES ('Mangás');
INSERT INTO cliente (nome,email,telefone) VALUES ('Alyson','junindopneu@gmail.com','31940028922');
INSERT INTO cliente (nome,email,telefone) VALUES ('Jarbas','shaolimmatadordeporco@gmail.com','31919451984');
INSERT INTO cliente (nome,email,telefone) VALUES ('Chaves','aichavinho@gmail.com','31984845959');
INSERT INTO vendedor (nome,comissao) VALUES ('Alfredo',200.50);
INSERT INTO vendedor (nome,comissao) VALUES ('Jofredo',30.50);
INSERT INTO vendedor (nome,comissao) VALUES ('Malfredo',85.30);
INSERT INTO produto (nome_compra,preco,id_categoria) VALUES ('Mouse Razer Brabo',100.00,1);
INSERT INTO produto (nome_compra,preco,id_categoria) VALUES ('GTA SANTO ANDRE',10.00,2);
INSERT INTO produto (nome_compra,preco,id_categoria) VALUES ('Berserk nº13',40.00,3);
INSERT INTO pedido (data_pedido,id_cliente,id_vendedor)VALUES('2026-10-22',1,1);
INSERT INTO pedido (data_pedido,id_cliente,id_vendedor)VALUES('2026-10-22',2,2);
INSERT INTO pedido (data_pedido,id_cliente,id_vendedor)VALUES('2026-10-22',3,3);
INSERT INTO item_pedido(id_pedido,id_produto,quantidade,preco_unitario) VALUES(1,1,1,350.00);
INSERT INTO item_pedido(id_pedido,id_produto,quantidade,preco_unitario) VALUES(2,2,1,60.00);
INSERT INTO item_pedido(id_pedido,id_produto,quantidade,preco_unitario) VALUES(3,3,1,90.00);
SELECT*FROM categoria;
SELECT*FROM cliente;
SELECT*FROM vendedor;
SELECT*FROM produto;
SELECT*FROM pedido;
SELECT*FROM item_pedido;

