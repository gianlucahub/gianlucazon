package com.gianlucazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = { "com.gianlucazon" })
public class GianlucazonApplication {

	public static void main(String[] args) {
		SpringApplication.run(GianlucazonApplication.class, args);
		System.out.println("Gianlucazon running cazzo!");
	}

}
