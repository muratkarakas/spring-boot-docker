FROM openjdk:8
VOLUME /tmp
ADD target/spring-boot-docker-0.0.1.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "java $JAVA_OPTS   -jar /app.jar" ]