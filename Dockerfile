FROM openjdk
COPY ./target/ai-0.0.1-SNAPSHOT.jar ./
CMD ["java","-jar","ai-0.0.1-SNAPSHOT.jar"]