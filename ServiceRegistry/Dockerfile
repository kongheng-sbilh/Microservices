FROM openjdk:21

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} service_registry.jar

ENTRYPOINT ["java", "-jar", "/service_registry.jar"]

EXPOSE 8761