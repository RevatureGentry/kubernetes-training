FROM maven:3.6.3-jdk-11-slim as builder
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests=true
RUN cp target/demo-backend-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]