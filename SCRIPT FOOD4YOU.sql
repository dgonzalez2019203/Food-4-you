create database if not exists food4you;
use food4you;


CREATE TABLE if not exists Alimentos (
  nombre VARCHAR(50) NOT NULL,
  valNutricional VARCHAR(100) NOT NULL,
   categoria VARCHAR(15),
  cantidad int ,
   placa VARCHAR(15),
	supermercado VARCHAR(15)
 
);

CREATE TABLE if not exists Categoria(
  nombre VARCHAR(50) NOT NULL,
  descripcion VARCHAR(100) NOT NULL
   
 
);

CREATE TABLE if not exists Detalle (
  alimento VARCHAR(50) NOT NULL,
  cantidad VARCHAR(100) NOT NULL,
  fecha VARCHAR(100) NOT NULL


 
);

CREATE TABLE if not exists Familia (
  apellidos VARCHAR(50) NOT NULL,
  totalmiembros int,
   cantNinos int,
  cantAdultos int,
   situacionPobreza VARCHAR(15)
	
 
);

CREATE TABLE if not exists Rol (
  nombre VARCHAR(50) NOT NULL,
  descripcion VARCHAR(100) NOT NULL
  
 
);

CREATE TABLE if not exists supermecado(
  nombre VARCHAR(50) NOT NULL,
  descripcion VARCHAR(100) NOT NULL,
   nivel INT(6)
 
 
);

CREATE TABLE if not exists tiket(
  familia VARCHAR(50) NOT NULL,
  fecha VARCHAR(100) NOT NULL,
   usuario VARCHAR(100) NOT NULL
 
 
);

CREATE TABLE if not exists usuario(
  name VARCHAR(50) NOT NULL,
  username VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL,
  telefono VARCHAR(100) NOT NULL


 
 
);