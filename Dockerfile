FROM maven:3.9.5-amazoncorretto-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src/ ./src/
RUN mvn -f /app/pom.xml clean package -DskipTests

FROM openjdk:21-jdk-slim
EXPOSE 8088
COPY --from=build /app/target/*.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]

