FROM adoptopenjdk:11-jre-hotspot

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} trip-api-docker.jar

ENTRYPOINT ["java", "-jar", "/trip-api-docker.jar"]