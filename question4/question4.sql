-- ETAPA 1: CREATE DATABASE
CREATE DATABASE question4

-- ETAPA 2: CREATE TABLES
-- ETAPA 2.1: CREATE TABLE Address
CREATE TABLE Address (
	address_id			SERIAL 			UNIQUE PRIMARY KEY,
	zip_code			VARCHAR[10]		NOT NULL,
	address 			VARCHAR[100]	NOT NULL,
	complement 			VARCHAR[100],
	neighborhood 		VARCHAR[100]	NOT NULL,
	city 				VARCHAR[100]	NOT NULL,
	state 				VARCHAR[100]	NOT NULL,
	country 			VARCHAR[100]	NOT NULL
);

-- ETAPA 2.2: CREATE TABLE Person
CREATE TABLE Person (
	person_id 			SERIAL			UNIQUE PRIMARY KEY,
	name 				VARCHAR[255]	NOT NULL,
	age 				SMALLINT		NOT NULL,
	phone 				VARCHAR[15] 	NOT NULL UNIQUE,
	height 				REAL			NOT NULL, 
	email 				VARCHAR[255]	NOT NULL UNIQUE,
	CPF 				VARCHAR[14]		NOT NULL UNIQUE,
	date_of_birthday 	DATE			NOT NULL,
	id_address 			INT				NOT NULL, 
	
	FOREIGN KEY (id_address) REFERENCES Address (address_id),
	CHECK (age > 0)
);

-- ETAPA 3: INSERT data
-- ETAPA 3.1: INSERT data in table Address
INSERT INTO Address (zip_code, address, complement, neighborhood, city, state, country) VALUES 
	('{12345-67}', '{Rua das Flores, 123}', '{Apto. 101}', '{Centro}', '{São Paulo}', '{SP}', '{Brasil}')

-- ETAPA 3.2: INSERT data in table Person
INSERT INTO Person (name, age, phone, height, email, CPF, date_of_birthday, id_address) VALUES
	('{João Silva}', 25, '{(11) 1234-5678}', 1.75, '{joao.silva@gmail.com}', '{123.456.789-00}', '1998-05-10', 1)