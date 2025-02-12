FROM openjdk:17-jdk-slim


WORKDIR /app


ARG JAR_FILE=target/eureka-sv-0.0.1-SNAPSHOT.jar



# Copia el archivo JAR de Eureka Server
COPY ${JAR_FILE} eureka-server.jar





ENTRYPOINT ["java", "-jar", "eureka-server.jar"]
