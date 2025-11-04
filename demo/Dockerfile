FROM maven:3.9.5-amazoncorretto-17 AS builder
WORKDIR /app
# Copy pom.xml và code
COPY pom.xml .
COPY src /app/src
# Chạy build (bỏ qua tests trong Docker build nếu bạn đã chạy tests trong Jenkins)
RUN mvn clean package -DskipTests

# Step 1: Use official OpenJDK image as base
FROM openjdk:17-jdk-slim

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy your JAR file into the container
# (Assuming you’ve already built it with `mvn clean package`)
COPY target/demo-0.0.1-SNAPSHOT.jar demo.jar

# Step 4: Expose the port your Spring Boot app runs on
EXPOSE 8080

# Step 5: Define the command to run your app
ENTRYPOINT ["java", "-jar", "demo.jar"]