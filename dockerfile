# ---- Stage 1: Build the application ----
    FROM maven:3.9.6-eclipse-temurin-21-alpine AS build

    WORKDIR /app
    
    # Copy Maven project files
    COPY pom.xml .
    COPY src ./src
    
    # Build the JAR file
    RUN mvn clean install -DskipTests
    
    # ---- Stage 2: Create a lightweight image with only the JAR ----
    FROM eclipse-temurin:21-jdk-alpine
    
    WORKDIR /app
    
    # Copy only the built JAR from the previous stage
    COPY --from=build /app/target/portfolio-api-0.0.1-SNAPSHOT.jar app.jar
    
    # Copy the .env file into the container
    COPY .env .env
    
    EXPOSE 3000
    
    ENTRYPOINT ["java", "-jar", "app.jar"]
    