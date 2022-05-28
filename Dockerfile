FROM openjdk:11.0.9.1-jre

ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-Dspring.profiles.active=aws", "-jar", "/app.jar"]