#FROM --platform=linux/arm64 mcr.microsoft.com/openjdk/jdk:21-mariner AS build
#ADD target/plantmanagement-0.0.1-SNAPSHOT.jar .
#EXPOSE 9090
#CMD java -jar plantmanagement-0.0.1-SNAPSHOT.jar

FROM mcr.microsoft.com/openjdk/jdk:21-mariner AS build

WORKDIR /app
COPY target/plantmanagement-0.0.1-SNAPSHOT.jar .

EXPOSE 9090
CMD ["java", "-jar", "plantmanagement-0.0.1-SNAPSHOT.jar"]
