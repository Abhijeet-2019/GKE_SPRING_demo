# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim
# Set the working directory inside the container
ARG JAR_FILE=target/*.jar

# Copy the packaged Spring Boot jar file into the container
COPY ${JAR_FILE} User_Service-0.0.1-SNAPSHOT.jar-.jar
# Expose the application port (change if needed)
EXPOSE 8080
# Command to run the application
ENTRYPOINT ["java","-jar","ROOT .jar"]

