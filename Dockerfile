FROM openjdk:11

ADD ./target/app-0.0.1-SNAPSHOT.jar app-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar","blog-api-docker.jar"]

EXPOSE 8080