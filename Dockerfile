# Use official OpenJDK image
FROM openjdk:17-alpine

# Set working directory inside the container
WORKDIR /app

# Copy the built jar from host
COPY target/portfolio-0.0.1-SNAPSHOT.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
