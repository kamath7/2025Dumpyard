package com.kamathad.Mockito5xExperiments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Mockito5xExperimentsApplication {
	public static void main(String[] args) {
		SpringApplication.run(Mockito5xExperimentsApplication.class, args);
	}
}
