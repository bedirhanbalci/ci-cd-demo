FROM maven:3.8.4-openjdk-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src/ ./src/
RUN mvn -f /app/pom.xml clean package -DskipTests

FROM openjdk:21-jdk-slim
EXPOSE 8088
COPY --from=build /app/target/*.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]

