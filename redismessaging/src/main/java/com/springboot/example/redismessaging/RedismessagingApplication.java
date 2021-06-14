package com.springboot.example.redismessaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.springboot.example.*"
							  })
public class RedismessagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedismessagingApplication.class, args);
	}

}
