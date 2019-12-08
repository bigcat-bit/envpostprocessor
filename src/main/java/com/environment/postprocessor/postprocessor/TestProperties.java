package com.environment.postprocessor.postprocessor;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "com")
@Component
public class TestProperties {
	private String usernametest;
	private String username2test;
	private Test test;
	
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public String getUsernametest() {
		return usernametest;
	}
	public void setUsernametest(String usernametest) {
		this.usernametest = usernametest;
	}
	public String getUsername2test() {
		return username2test;
	}
	public void setUsername2test(String username2test) {
		this.username2test = username2test;
	}
	
	
}
