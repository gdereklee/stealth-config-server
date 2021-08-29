package com.stealth.oms.configuration.stealthconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class StealthConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StealthConfigServerApplication.class, args);
	}

}
