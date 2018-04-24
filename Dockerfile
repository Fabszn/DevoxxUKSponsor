FROM openjdk:8-jre-alpine

COPY ./build/libs/uk.jar /root/uk.jar

WORKDIR /root

CMD ["java", "-server", "-XX:+UseG1GC", "-XX:MaxGCPauseMillis=100", "-XX:+UseStringDeduplication", "-jar", "uk.jar"]