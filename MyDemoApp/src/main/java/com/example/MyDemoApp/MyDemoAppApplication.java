package com.example.MyDemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyDemoAppApplication {

	public static void main(String[] args) {
		// SpringApplication.run(MyDemoAppApplication.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(MyDemoAppApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
