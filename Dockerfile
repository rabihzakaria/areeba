# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory to /app
WORKDIR /app

# Copy the JAR file into the container at /app
COPY ./target/backend-0.0.1-SNAPSHOT.jar /app

# Expose the port specified in your application.properties/yml
EXPOSE 8081

# Run the application when the container launches
CMD ["java", "-jar", "backend-0.0.1-SNAPSHOT.jar"]
