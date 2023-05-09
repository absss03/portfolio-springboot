FROM amazoncorretto:17-alpine-jdk
MAINTAINER Abi
COPY target/abi-0.0.1-SNAPSHOT.jar abi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/abi-0.0.1-SNAPSHOT.jar"]