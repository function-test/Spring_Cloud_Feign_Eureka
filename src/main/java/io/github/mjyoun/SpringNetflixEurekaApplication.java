package io.github.mjyoun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringNetflixEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringNetflixEurekaApplication.class, args);
	}

}
