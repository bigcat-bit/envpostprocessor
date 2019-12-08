package com.environment.postprocessor.postprocessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class PostprocessorApplication {
	
	
	
	public static void main(String[] args) {
		//SpringApplication.run(PostprocessorApplication.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(PostprocessorApplication.class,args);
		
		//String username = context.getEnvironment().getProperty("username1.test");
        //String password = context.getEnvironment().getProperty("password1.test");
        //System.out.println("username==="+testProperties.);
        //System.out.println("password==="+password);
		//System.out.println("aaa"+testProperties.getUsernametest());
        //context.close();
	}

}
