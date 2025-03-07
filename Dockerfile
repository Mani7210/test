FROM adoptopenjdk:17-jre-alpine

# Expose the application port
EXPOSE 8001

# Set the working directory inside the container
WORKDIR /opt/app

# Copy the JAR file from the build target to the container
COPY target/test-0.0.1-SNAPSHOT.jar app.jar

# Define the command to run your application
ENTRYPOINT ["java", "-jar", "app.jar"]
