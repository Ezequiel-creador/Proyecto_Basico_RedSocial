FROM openjdk:17-jdk-slim


WORKDIR /app


ARG JAR_FILE=target/users-service-0.0.1-SNAPSHOT.jar



# Copia el archivo JAR de Eureka Server
COPY ${JAR_FILE} users-server.jar


# Ejecuta el archivo JAR de Eureka Server
ENTRYPOINT ["java", "-jar", "users-server.jar"]
