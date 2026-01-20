package com.example.demo.check;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class MyBeanTester {

	@PostConstruct
	 public void checkPostConstruct() {
		System.out.println("Checking custom init method");
		System.out.println("Checking again");
	}
	
	@PreDestroy
	public void checkPredestroy() {
		System.out.println("Bean is destroyed");
	}
}
