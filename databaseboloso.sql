create database meta_bolos;
use meta_bolos;



create table producao (idproducao int not null auto_increment primary key, produto varchar(50) not null, 
quant int not null, vr_venda decimal(10,2)not null);


create table clientes (idclientes int not null auto_increment primary key, nome varchar(50) not null, cep varchar(8) not null, bairro varchar(50) not null, 
numero int not null, dt_entrega date not null, idproducao int not null, foreign key (idproducao) references producao (idproducao));

create table forma_pgto(idpgto int not null auto_increment primary key, descricao varchar(20), idclientes int not null, 
foreign key (idclientes) references clientes(idclientes));

create table pdv (idpdv int not null auto_increment primary key, vr_produtos decimal(10,2) not null, vr_total decimal(10,2) not null,
dtvenda date not null, idclientes int not null, foreign key (idclientes) references clientes(idclientes), idpgto int not null, foreign key (idpgto) 
references forma_pgto(idpgto));
