create database food4you;

CREATE TABLE Alimentos (
  nombre VARCHAR(50) NOT NULL,
  valNutricional VARCHAR(100) NOT NULL,
   cantidad INT(6),
  categoria VARCHAR(15),
   placa VARCHAR(15),
	supermercado VARCHAR(15)
 
);

CREATE TABLE Categoria (
  nombre VARCHAR(50) NOT NULL,
  descripcion VARCHAR(100) NOT NULL
   
 
);

CREATE TABLE Detalle (
  alimento VARCHAR(50) NOT NULL,
  cantidad VARCHAR(100) NOT NULL,
  fecha VARCHAR(100) NOT NULL


 
);

CREATE TABLE Familia (
  apellidos VARCHAR(50) NOT NULL,
  totalmiembros VARCHAR(100) NOT NULL,
   cantNinos VARCHAR(6),
  cantAdultos VARCHAR(15),
   situacionPobreza VARCHAR(15),
	supermercado VARCHAR(15)
 
);

CREATE TABLE Rol (
  nombre VARCHAR(50) NOT NULL,
  descripcion VARCHAR(100) NOT NULL
  
 
);

CREATE TABLE supermecado (
  nombre VARCHAR(50) NOT NULL,
  descripcion VARCHAR(100) NOT NULL,
   nivel INT(6)
 
 
);