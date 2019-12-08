package com.environment.postprocessor.postprocessor;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Testload {
	
	@Autowired
	private  TestProperties testProperties;
	
	@PostConstruct
	public void inittestProperties() {
		System.out.println("load............."+testProperties.getTest().getUsernametest());
	}
	
}
