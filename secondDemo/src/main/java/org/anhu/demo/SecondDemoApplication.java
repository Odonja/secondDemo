package org.anhu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.anhu")
public class SecondDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondDemoApplication.class, args);
	}
}
