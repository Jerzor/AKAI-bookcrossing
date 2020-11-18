FROM openjdk:14
WORKDIR /app
EXPOSE 8080
ADD target/bookcrossing-0.0.1.jar bookcrossing-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/app/bookcrossing-0.0.1.jar"]