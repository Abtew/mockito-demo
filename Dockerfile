#Start with the base image containing Java runtime
FROM openjdk:8

#Make port 8080 available to the world outside this container
EXPOSE 8080

ADD target/mockito-docekr-jenkin-integration.jar mockito-docekr-jenkin-integration.jar

#Run the jar file
ENTRYPOINT ["java","-jar","/mockito-docekr-jenkin-integration.jar"]