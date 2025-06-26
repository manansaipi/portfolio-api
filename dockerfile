# Use a lightweight OpenJDK 21 image (Alpine-based)
FROM eclipse-temurin:21-jdk-alpine

# Set the working directory inside the container
WORKDIR /app


# Copy the built JAR file into the container
COPY target/portfolio-api-0.0.1-SNAPSHOT.jar app.jar

# Copy the .env file into the container
COPY .env .env

# Expose the port used by the application (match your app's server.port)
EXPOSE 3000

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
