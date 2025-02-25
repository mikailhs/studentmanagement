FROM openjdk:23-jdk

WORKDIR /app

# Update the COPY command to point to the correct location of the JAR file
COPY build/libs/studentmanagement-0.0.1-SNAPSHOT.jar /app/studentmanagement.jar

# Expose the port the app will run on
EXPOSE 8080

# Entry point to run the application
ENTRYPOINT ["java", "-jar", "studentmanagement.jar"]
