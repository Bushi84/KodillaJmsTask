package com.example.jmsorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class JmsOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsOrderApplication.class, args);
	}

}
