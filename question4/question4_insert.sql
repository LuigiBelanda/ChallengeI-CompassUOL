-- ETAPA 3: INSERT data
-- ETAPA 3.1: INSERT data in table Address
INSERT INTO Address (zip_code, address, complement, neighborhood, city, state, country) VALUES 
	('98989-989', 'Rua fulano de tal, 666', 'Apto. 333', 'Centro', 'Itápolis', 'SP', 'Brasil'),
	('98765-432', 'Avenida de algum lugar, 321', NULL, 'Centro', 'Ribeirão Preto', 'SP', 'Brasil');

-- ETAPA 3.2: INSERT data in table Person
INSERT INTO Person (name, age, phone, height, email, CPF, date_of_birthday, id_address) VALUES
	('Ciclano da Silva', 32, '(16) 76678-8585', 1.75, 'ciclano.silva@gmail.com', '444.208.101-08', '2023-08-15', 1),
	('Cleber Machado', 18, '(12) 9876-5432', 1.85, 'cleber.machado@gmail.com', '987.654.321-11', '2023-05-10', 2);
