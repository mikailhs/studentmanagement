FROM openjdk:21-jdk

WORKDIR /app

# Ensure JAR is copied correctly
COPY build/libs/*.jar /app/app.jar

# Expose port for Spring Boot
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
