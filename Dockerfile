FROM openjdk:8
EXPOSE 8080
ADD target/spring-automation.jar spring-automation.jar
ENTRYPOINT ["java","-jar","/spring-automation.jar"]