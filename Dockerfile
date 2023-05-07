FROM amazoncorretto: 11-alpine-jdk
MAINTAINER Abi
COPY target/abi-0.0.1-SNAPSHOT.jar abi-app.jar
ENTRYPOINT ["java","-jar","/abi-app.jar"]