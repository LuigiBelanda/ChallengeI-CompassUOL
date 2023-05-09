CREATE DATABASE question4 

CREATE TABLE Address (
	address_id 		INT 			UNIQUE PRIMARY KEY,
	zip_code		VARCHAR[10],
	address 		VARCHAR[100],
	complement 		VARCHAR[100],
	neighborhood 	VARCHAR[100],
	city 			VARCHAR[100],
	state 			VARCHAR[100],
	country 		VARCHAR[100]
);

CREATE TABLE Person (
	person_id 			INT 			UNIQUE PRIMARY KEY,
	name 				VARCHAR[255],
	age 				SMALLINT,
	phone 				VARCHAR[15],
	height 				FLOAT, 
	email 				VARCHAR[255],
	CPF 				VARCHAR[14],
	date_of_bithday 	DATE,
	address_id 			INT, 
	
	FOREIGN KEY (address_id) REFERENCES Address (addressId),
	CHECK (age > 0)
);