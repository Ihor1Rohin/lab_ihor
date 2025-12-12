FROM eclipse-temurin:21-jdk
LABEL authors="Ihor"

WORKDIR /app

COPY build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
