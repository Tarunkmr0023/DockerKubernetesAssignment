package com.nagarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerKubernetesAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerKubernetesAssignmentApplication.class, args);
		System.out.println("Spring boot app is working fine.");
	}

}
