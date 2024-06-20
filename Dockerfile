FROM openjdk:17

COPY out/artifacts/Java_Junior_jar2/Java-Junior.jar /tmp/Java-Junior.jar
WORKDIR /tmp
CMD ["java", "-jar", "/tmp/Java-Junior.jar"]