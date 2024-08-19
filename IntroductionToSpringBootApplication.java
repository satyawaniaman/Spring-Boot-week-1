package com.week1Introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {
	@Autowired
	Factorial fact;
	@Autowired
	DBService dbService;
	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		int n=3;
//		System.out.println(fact.factorial(n));
//		System.out.println(fact.hashCode());
		System.out.println(dbService.getData() );
	}
}
