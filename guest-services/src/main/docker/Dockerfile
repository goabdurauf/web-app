FROM openjdk:11

MAINTAINER Richard Chesterwood "contact@virtualpairprogrammers.com"

EXPOSE 8080

WORKDIR /usr/local/bin/

COPY maven/guest-services-0.0.1-SNAPSHOT.jar webapp.jar

CMD ["java", "-jar", "webapp.jar"]