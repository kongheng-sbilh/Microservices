FROM openjdk:21

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} core_banking_service.jar

ENTRYPOINT ["java", "-jar", "/core_banking_service.jar"]

EXPOSE 9020