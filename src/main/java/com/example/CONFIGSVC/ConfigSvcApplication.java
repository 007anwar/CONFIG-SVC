package com.example.CONFIGSVC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.retry.annotation.Retryable;

@SpringBootApplication
@EnableConfigServer
@Retryable
public class ConfigSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigSvcApplication.class, args);
	}

}
