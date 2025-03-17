# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot jar file into the container
ARG JAR_FILE=target/user-service.jar
COPY ${JAR_FILE} app.jar

# Expose the application port (change if needed)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java","-jar","app.jar"]