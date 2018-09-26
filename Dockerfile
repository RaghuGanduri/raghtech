FROM openjdk:8
ADD @project.build.finalName@.jar bank-0.1.0.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "bank-0.1.0.jar"]