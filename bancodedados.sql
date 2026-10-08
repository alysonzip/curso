-- create
CREATE TABLE categoria (
  id_categoria INT AUTO_INCREMENT,
  nome_compra VARCHAR(50) NOT NULL, 
  CONSTRAINT pk_categoria PRIMARY KEY(id_categoria)
);

CREATE TABLE cliente (
  id_cliente INT AUTO_INCREMENT,
  nome VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  CONSTRAINT pk_cliente PRIMARY KEY(id_cliente) 
);

CREATE TABLE vendedor (
  id_vendedor INT AUTO_INCREMENT, 
  nome VARCHAR(50) NOT NULL,
  comissao DECIMAL(4,2) NOT NULL,
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

