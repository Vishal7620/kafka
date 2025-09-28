package com.example.ride;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class RideApplication {

	public static void main(String[] args) {
		SpringApplication.run(RideApplication.class, args);
	}

}
