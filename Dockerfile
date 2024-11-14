# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the compiled JAR file from the target directory
COPY target/sample-springboot-app-0.0.1-SNAPSHOT.jar /app/sample-springboot-app.jar

# Expose the port the app runs on
EXPOSE 9090

# Run the JAR file
ENTRYPOINT ["java", "-jar", "sample-springboot-app.jar"]
