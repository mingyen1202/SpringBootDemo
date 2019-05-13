package com.chtti.demo.DemoHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@Import({AppConfig.class, AppConfig2.class})
public class DemoHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHelloWorldApplication.class, args);
	}

}
