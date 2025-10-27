LABEL authors="Moqbel"
# ------------------------------------
# Stage 1: Build the Executable JAR
# ------------------------------------
FROM eclipse-temurin:21-jdk-jammy AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the build files (pom.xml or build.gradle) first to leverage Docker layer caching
# This is a key optimization step
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
# For Gradle/Kotlin, copy: COPY gradlew . COPY build.gradle.kts .
# Download dependencies (only run if build file changes)
# RUN ./mvnw dependency:go-offline
# Copy the rest of the source code
COPY src src

# Package the application (compiles Kotlin and creates the JAR)
RUN ./mvnw clean package -DskipTests

# ------------------------------------
# Stage 2: Create the Final Runtime Image
# ------------------------------------
# Use a JRE-only image for a much smaller and more secure final image
FROM eclipse-temurin:21-jre-jammy

# Set the working directory
WORKDIR /app

# The name of your executable JAR file (e.g., target/app-0.0.1-SNAPSHOT.jar)
ARG JAR_FILE=target/*.jar

# Copy the final JAR from the 'build' stage into the new, lightweight JRE stage
COPY --from=build /app/${JAR_FILE} app.jar

# Expose the default port for Spring Boot (or your configured port)
EXPOSE 5432

# The command to start the application
ENTRYPOINT ["java", "-jar", "app.jar"]