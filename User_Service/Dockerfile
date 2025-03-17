# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-alpine
# Set the working directory inside the container
ARG JAR_FILE=target/*.jar
# Copy the packaged Spring Boot jar file into the container
COPY ${JAR_FILE} user-service.jar
# Expose the application port (change if needed)
EXPOSE 8080
# Command to run the application
ENTRYPOINT ["java","-jar","ROOT .jar"]
