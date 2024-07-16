# Use an official Maven image as a parent image
FROM maven:3.8.1-jdk-11 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the project files into the container
COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package

# Second stage for lightweight production image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the built artifact from the build stage into the production image
COPY --from=build /app/target/*.jar ./app.jar

# Specify the command to run on container startup
CMD ["java", "-jar", "app.jar"]
