# Portfolio API Backend

This project serves as the backend API for my personal portfolio website, managing data related to posts, comments, and work entries.

## Technologies Used

*   Java
*   Spring Boot
*   Maven
*   (Potentially a database like H2, MySQL, PostgreSQL - will assume H2 for local development)

## Features

*   **Post Management:** CRUD operations for blog posts.
*   **Comment Management:** Functionality for adding and managing comments on posts.
*   **Work Entry Management:** CRUD operations for portfolio work entries, including images and points.

## Getting Started

### Prerequisites

*   Java Development Kit (JDK) 17 or higher
*   Maven 3.x

### Installation

1.  Clone the repository:
    ```bash
    git clone https://github.com/your-username/portfolio-api.git
    cd portfolio-api
    ```

2.  Build the project using Maven:
    ```bash
    mvn clean install
    ```

### Running the Application

To run the Spring Boot application:

```bash
mvn spring-boot:run
```

The application will typically start on `http://localhost:8080`.

## API Endpoints

The API provides endpoints for managing:

*   `/api/posts`
*   `/api/comments`
*   `/api/work`

Detailed API documentation (e.g., Swagger UI) might be available at `/swagger-ui.html` if configured.

## Database Configuration

The application uses `src/main/resources/application.properties` for database configuration. By default, it might be configured to use an in-memory H2 database for development purposes. For production, you would configure it to connect to an external database like MySQL or PostgreSQL.

Example `application.properties` for H2 (default):

```properties
spring.datasource.url=jdbc:h2:mem:portfolio_db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```
