package com.example.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		//ApplicationContext applicationContext;

		ApplicationContext applicationContext = SpringApplication.run(MyAppApplication.class, args);

		//Dev devObj = new Dev();
		Dev devObj = applicationContext.getBean(Dev.class);
		devObj.build();
	}

}
