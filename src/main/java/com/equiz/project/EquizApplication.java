package com.equiz.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class EquizApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquizApplication.class, args);
	}

}
