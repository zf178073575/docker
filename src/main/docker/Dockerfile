FROM java:8

VOLUME /tmp

COPY docker-0.0.1-SNAPSHOT.jar app.jar

RUN bash -c "touch /app.jar"

EXPOSE 9001

ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=test", "--server.port=9001", "> /log/app.log"]