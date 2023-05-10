-- ETAPA 4: Tests
-- ETAPA 4.1: Test check age
INSERT INTO Person (name, age, phone, height, email, CPF, date_of_birthday, id_address) VALUES
	('{Luan Cristovão}', 0, '{(44) 11111-1111}', 1.55, '{luan.cristovão@gmail.com}', '{111.111.111-11}', '2023-08-16', 1)



-- ETAPA 4.2: UNIQUES (Person)
-- ETAPA 4.2.1: phone
INSERT INTO Person (name, age, phone, height, email, CPF, date_of_birthday, id_address) VALUES
	('{Luan Cristovão}', 18, '{(16) 76678-8585}', 1.55, '{luan.cristovão@gmail.com}', '{111.111.111-11}', '2023-08-16', 1);

-- ETAPA 4.2.2: email
INSERT INTO Person (name, age, phone, height, email, CPF, date_of_birthday, id_address) VALUES
	('{Luan Cristovão}', 18, '{(44) 11111-1111}', 1.55, '{cleber.machado@gmail.com}', '{111.111.111-11}', '2023-08-16', 1);

-- ETAPA 4.2.3: CPF
INSERT INTO Person (name, age, phone, height, email, CPF, date_of_birthday, id_address) VALUES
	('{Luan Cristovão}', 18, '{(44) 11111-1111}', 1.55, '{luan.cristovão@gmail.com}', '{987.654.321-11}', '2023-08-16', 1);



-- ETAPA 4.3: Verify FK 
INSERT INTO Person (name, age, phone, height, email, CPF, date_of_birthday, id_address) VALUES
	('{Luan Cristovão}', 18, '{(44) 11111-1111}', 1.55, '{luan.cristovão@gmail.com}', '{111.111.111-11}', '2023-08-16', 3);