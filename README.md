# Pet Management System using Spring Boot

The Pet Management System is a simple application built using Spring Boot that allows users to perform CRUD (Create, Read, Update, Delete) operations on pet records. The system stores pet details in an H2 in-memory database. Below are the key components of the project:

## Project Structure

<img src="https://github.com/Abhishek1061/Pet_Management_System_Project/blob/master/File_Structure/Structure.png" width=300, height=400>

## Dependencies

The project uses the following dependencies:

- **Spring Web (spring-boot-starter-web)**: Provides support for building web applications.
- **H2 Database (com.h2database:h2)**: An embedded in-memory database for development and testing.
- **Spring Data JPA (spring-boot-starter-data-jpa)**: Simplifies working with JPA (Java Persistence API).

## Functionality

The Pet Management System includes the following features:

1. **Add Pet**: Users can add pet details to the system.
2. **Delete Pet**: Users can delete pet records using the pet's ID.
3. **Get All Pets**: Users can retrieve all pet records.
4. **Update Pet**: Users can update existing pet records.

## How to Run

1. Clone this repository.
2. Open the project in your preferred IDE (e.g., Eclipse, IntelliJ IDEA).
3. Build and run the `PetManagementSystemApplication` class.
4. Access the application at `http://localhost:9191`.

## API Endpoints

- **Add Pet**: `POST- localhost:9191/pet/add`
- **Delete Pet**: `DELETE- localhost:9191/pet/deleted/{id}`
- **Get All Pets**: `GET- localhost:9191/pet/all`
- **Update Pet**: `PUT- localhost:9191/pets/updated/{id}`

## Notes

- The H2 database is an in-memory database, so data will be lost when the application shuts down.
- Customize the application.properties file for database configuration.

Feel free to explore and enhance the Pet Management System! 🐾🌟

