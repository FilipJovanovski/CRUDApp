package com.example.CRUDApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EntityScan("com.example.CRUDApp.Model")
@SpringBootApplication
@EnableSwagger2
public class CrudApp {

	public static void main(String[] args) {
		SpringApplication.run(CrudApp.class, args);
	}

}
