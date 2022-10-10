FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/springboot-actions-new.jar springboot-actions-new.jar
ENTRYPOINT ["java","-jar","/springboot-actions-new.jar"]