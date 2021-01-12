package com.gianlucazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.gianlucazon" })
public class GianlucazonApplication {

	public static void main(String[] args) {
		SpringApplication.run(GianlucazonApplication.class, args);
	}

}
