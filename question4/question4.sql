CREATE DATABASE question4 

CREATE TABLE Address (
	addressId 		INT UNIQUE PRIMARY KEY,
	zip 			VARCHAR[10],
	street 			VARCHAR[100],
	complement 		VARCHAR[100],
	neighborhood 	VARCHAR[100],
	city 			VARCHAR[100],
	state 			VARCHAR[100],
	country 		VARCHAR[100]
);