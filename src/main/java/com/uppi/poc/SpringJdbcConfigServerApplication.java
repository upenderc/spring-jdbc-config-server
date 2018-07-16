package com.uppi.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigServer
@ComponentScan(basePackageClasses= {DataProperties.class})
public class SpringJdbcConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcConfigServerApplication.class, args);
	}
}
