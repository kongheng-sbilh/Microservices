FROM openjdk:21

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} authentication_service.jar

ENTRYPOINT ["java", "-jar", "/authentication_service.jar"]

EXPOSE 9010