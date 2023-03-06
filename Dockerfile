FROM openjdk:8

EXPOSE 8100

ADD target/DockerKubernetesAssignment-0.0.1-SNAPSHOT.jar DockerKubernetesAssignment-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "DockerKubernetesAssignment-0.0.1-SNAPSHOT.jar"]