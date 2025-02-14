# Murasaki Gym

Murasaki Gym é uma aplicação desenvolvida para personal trainers e seus alunos, seguindo os princípios da Clean Architecture. A aplicação permitindo que os personal trainers prescrevam treinos personalizados para seus alunos e os ajustem conforme necessário. Além disso, os alunos podem registrar suas informações corporais, como peso, percentual de gordura e outras métricas, para acompanhar sua evolução ao longo do tempo.

---

## Table of Contents

- [Tech Stack](#Tech-Stack)
- [Project Structure](#Project-Structure)
- [Prerequisites](#Prerequisites)
- [API Endpoints](#API-Endpoints)
- [Database Migrations](#Database-Migrations)
- [Testing](#Testing)
- [License](#License)

---

## Tech Stack

O projeto foi desenvolvido com as seguintes tecnologias:

- **Java 23**: Modern Java features for cleaner and more efficient code.
- **Spring Framework**: Includes Spring Boot for rapid development and Spring Data for database interaction.
- **Docker**: Containerized application for easy deployment.
- **Flyway**: For managing database schema migrations.
- **PostgreSQL**: Reliable and scalable database backend.

---

## Project Structure

The project follows the principles of **Clean Architecture**, ensuring:
- **Separation of Concerns**: Dividing the application into clear layers (Domain, Application, Infrastructure, and Presentation).
- **Testability**: High test coverage and easily testable components.
- **Flexibility**: Easy adaptability for new features and integrations.

```
src
├── main
│   ├── java
│   │   └── com.example.eventmanagement
│   │       ├── application  # Application logic
│   │       ├── domain       # Core business rules
│   │       ├── infrastructure # External integrations and database
│   │       └── presentation  # Controllers and REST endpoints
│   └── resources
│       ├── db/migration     # Flyway migrations
│       └── application.yml  # Application configuration
└── test
    └── java                 # Unit and integration tests
```

---

## Prerequisites
Ensure you have the following installed:
- [Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Docker](https://www.docker.com/)
- [Maven](https://maven.apache.org/)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/luisgomes2002/Murasaki-Gym-API.git
   cd MurasakiGym
   ```

2. Start the application with Docker:
   ```bash
   docker-compose up
   ```

3. Access the API documentation (Swagger):
   ```
   http://localhost:8080/swagger-ui/index.html
   ```

---

## API Endpoints

### Students
- **GET /students**: Retrieve a list of students.
- **POST /students**: Create a new student.
- **PUT /students/{id}**: Update a student by ID.
- **DELETE /students/{id}**: Delete a student by ID.

### Personal Trainer

### Training Plan

### Execise

---

## Database Migrations
This project uses **Flyway** for database schema migrations. All migration scripts are located in the `src/main/resources/db/migration` folder. To run migrations manually, use:
```bash
mvn flyway:migrate
```

---

## Testing

### Unit Tests
Run unit tests with:
```bash
mvn test
```

### Integration Tests
Ensure the database is running and execute:
```bash
mvn verify
```

---

## License
This project is licensed under the [MIT License](LICENSE).

---

## Contact
For questions or feedback, please contact us at [luisgmgomes@mail.com](luisgmgomes@mail.com).