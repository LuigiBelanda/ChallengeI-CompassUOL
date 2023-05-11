// CREATE DATABASE
use question5

// CREATE COLLECTION 
db.createCollection("Persons")

// CREATE DOCUMENT
db.Persons.insertOne({
  Object: "X",
  name: "Teste",
  age: 18,
  phone: "+99 99999-9999",
  height: 1.85,
  email: "teste.teste@gmail.com",
  CPF: "999.999.999-99",
  date_of_birth: "2023-05-11",
  address: {
    zipCode: "99999-999",
    street: "Rua tal",
    neighborhood: "Sei lá",
    complement: "Apto. 999",
    city: "São Paulo",
    state: "SP",
    country: "Brasil"
  }
});
