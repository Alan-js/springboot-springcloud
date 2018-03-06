package com.alan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		new SpringApplicationBuilder(DemoApplication.class).web(true).run(args);
	}

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public ResponseEntity<String> hello() {
		System.out.println("hello rest service");
		return  new ResponseEntity<>("hello rest service", HttpStatus.OK);
	}

}
