FROM openjdk:11
RUN mvnw package
COPY target/HelloWorldSpring.jar /app/
