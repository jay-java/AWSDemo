FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/awsdemo.jar /app/awsdemo.jar
CMD ["java", "-jar", "awsdemo.jar"]
EXPOSE 8081
