package com.rabbitmq.stream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(CustomerRegistrationInput.class)
public class CustomerRegistrationSink {

	@StreamListener(target = CustomerRegistrationInput.INPUT)
	public void processEmployee(String customer) {
		System.out.println("Customer Registered by Client " + customer);
	}

}
