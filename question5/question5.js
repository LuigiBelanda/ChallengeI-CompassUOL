// CREATE DATABASE
use question5

// CREATE COLLECTION 
db.createCollection("Persons")

// CREATE DOCUMENT
db.Persons.insertOne({
  name: "Teste",
  age: 18,
  phone: "+99 99999-9999",
  height: 1.85,
  email: "teste.teste@gmail.com",
  cpf: "999.999.999-99",
  date_of_birthday: "2023-05-11",
  Address: {
    zip_code: "99999-999",
    street: "Rua tal",
    neighborhood: "Sei lá",
    complement: "Apto. 999",
    city: "São Paulo",
    state: "SP",
    country: "Brasil"
  }
});

// Find documents
db.getCollection("Persons").find({})