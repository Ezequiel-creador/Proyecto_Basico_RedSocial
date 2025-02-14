FROM openjdk:17-jdk-slim


WORKDIR /app


ARG JAR_FILE=target/users-service-0.0.1-SNAPSHOT.jar



# Copia el archivo JAR de Eureka Server
COPY ${JAR_FILE} users-server.jar

RUN apt-get update && apt-get install -y wget && \
    wget https://github.com/jwilder/dockerize/releases/download/v0.6.1/dockerize-linux-amd64-v0.6.1.tar.gz && \
    tar -xvzf dockerize-linux-amd64-v0.6.1.tar.gz && \
    mv dockerize /usr/local/bin && \
    rm dockerize-linux-amd64-v0.6.1.tar.gz


# Ejecuta el archivo JAR de Eureka Server
ENTRYPOINT ["java", "-jar", "users-server.jar"]
