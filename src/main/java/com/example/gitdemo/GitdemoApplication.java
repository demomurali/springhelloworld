package com.example.gitdemo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class GitdemoApplication {

	public static void main(String[] args) {
		System.out.println("inside demo");
		SpringApplication.run(GitdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return (args) -> {
			System.out.println("ctx.getBeanDefinitionCount()"+ctx.getBeanDefinitionCount());	
					Arrays.stream(ctx.getBeanDefinitionNames())
					.sorted()
					.forEach(name->System.out.println(name));
		};
		  
		  
	  }
	
}
