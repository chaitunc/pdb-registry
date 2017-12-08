package org.pdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PDBRegistry {

	public static void main(String[] args) {
		SpringApplication.run(PDBRegistry.class, args);
	}

}
