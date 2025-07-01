    FROM eclipse-temurin:21-jdk-alpine

    WORKDIR /app
    
    # Copy only the built JAR from the previous stage
    COPY  /target/portfolio-api-0.0.1-SNAPSHOT.jar app.jar

    EXPOSE 3000
    
    ENTRYPOINT ["java", "-jar", "app.jar"]
