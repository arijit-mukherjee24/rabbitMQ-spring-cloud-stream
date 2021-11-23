package com.rabbitmq.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(EmployeeRegistrationInput.class)
public class EmployeeRegistrationSink {
	
	@StreamListener(target = EmployeeRegistrationInput.INPUT)
	public void processEmployee(String employee) {
		System.out.println("Employees Registered by Client " + employee);
	}
}
