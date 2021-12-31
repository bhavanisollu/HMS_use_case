FROM localhost:8080/openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
EXPOSE 8080
ADD ${JAR_FILE} user-service.jar
COPY ./execute.sh ./execute.sh
ENTRYPOINT ["./execute.sh"]