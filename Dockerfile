FROM openjdk:8
COPY build/libs/OnlineElectronicStrore1-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 4441
CMD java -jar /app.jar
