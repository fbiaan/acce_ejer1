FROM openjdk:11
VOLUME /tmp
EXPOSE 3005
ARG JAR_FILE=target/ejercicio-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]