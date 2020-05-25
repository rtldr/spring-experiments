package com.spring.experiments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerInterceptor;

@SpringBootApplication
public class ExperimentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperimentsApplication.class, args);
	}

}
