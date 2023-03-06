FROM openjdk:8

COPY target/DockerKubernetesAssignment-0.0.1-SNAPSHOT.jar .

EXPOSE 8100

ENTRYPOINT ["java", "-jar", "DockerKubernetesAssignment-0.0.1-SNAPSHOT.jar"]
