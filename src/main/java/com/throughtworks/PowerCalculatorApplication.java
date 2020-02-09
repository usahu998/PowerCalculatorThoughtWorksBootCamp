package com.throughtworks;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAutoConfiguration
@SpringBootApplication
public class PowerCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerCalculatorApplication.class, args);
	}

}
