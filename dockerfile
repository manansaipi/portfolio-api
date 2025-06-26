# Use a lightweight OpenJDK 21 image (Java 24 not available yet in Alpine)
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the Maven build output JAR into the container
COPY target/portfolio-api-0.0.1-SNAPSHOT.jar app.jar

# Expose the port Render uses
EXPOSE 10000

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
