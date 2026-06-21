# ---------------------------------------------------------
# Assignment 5 - Docker Containerization
# Author: Johnathan G Baez
# Project: assignment2-build-demo
# Purpose: Build and run the Java Maven application in Docker
# ---------------------------------------------------------

FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package

FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]
