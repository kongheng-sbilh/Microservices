FROM openjdk:21

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} card_system_service.jar

ENTRYPOINT ["java", "-jar", "/card_system_service.jar"]

EXPOSE 9030