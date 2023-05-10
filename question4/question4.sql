-- ETAPA 1: CREATE DATABASE
CREATE DATABASE question4



-- ETAPA 2: CREATE TABLES
-- ETAPA 2.1: CREATE TABLE Address
CREATE TABLE Address (
	address_id			SERIAL 			UNIQUE PRIMARY KEY,
	zip_code			VARCHAR(10)		NOT NULL,
	address 			VARCHAR(100)	NOT NULL,
	complement 			VARCHAR(100),
	neighborhood 		VARCHAR(100)	NOT NULL,
	city 				VARCHAR(100)	NOT NULL,
	state 				VARCHAR(100)	NOT NULL,
	country 			VARCHAR(100)	NOT NULL
);

-- ETAPA 2.2: CREATE TABLE Person
CREATE TABLE Person (
	person_id 			SERIAL			UNIQUE PRIMARY KEY,
	name 				VARCHAR(255)	NOT NULL,
	age 				SMALLINT		NOT NULL,
	phone 				VARCHAR(15) 	NOT NULL UNIQUE,
	height 				REAL			NOT NULL, 
	email 				VARCHAR(255)	NOT NULL UNIQUE,
	CPF 				VARCHAR(14)		NOT NULL UNIQUE,
	date_of_birthday 	DATE			NOT NULL,
	id_address 			INT				NOT NULL, 
	
	FOREIGN KEY (id_address) REFERENCES Address (address_id),
	CHECK (age > 0)
);



-- ETAPA 3: question4_insert.sql



-- ETAPA 4: question4_tests.sql