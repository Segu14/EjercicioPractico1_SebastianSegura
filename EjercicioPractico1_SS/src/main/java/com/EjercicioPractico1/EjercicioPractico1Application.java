package com.EjercicioPractico1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EjercicioPractico1Application {
    
        @GetMapping("/hello")
        public String hello(){
            return "Hello World";
        }
        
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPractico1Application.class, args);
	}

}
