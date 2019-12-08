package com.environment.postprocessor.postprocessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private  TestProperties testProperties;
	
	@GetMapping("/test")
	public String test() {
		String aa  = testProperties.getUsername2test();
		Test Tes = testProperties.getTest();
		return "aaaaaa";
	}
	
}
