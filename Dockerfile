FROM adoptopenjdk/openjdk11:alpine-jre

# Expose port 587/tcp (assuming your application uses this port)
EXPOSE 8001

# Set the working directory inside the container
WORKDIR /opt/app

# Copy the JAR file from the build target to the container
COPY target/testtttttttttt-0.0.1-SNAPSHOT.jar app.jar

# Define the command to run your application
ENTRYPOINT ["java", "-jar", "app.jar"]
