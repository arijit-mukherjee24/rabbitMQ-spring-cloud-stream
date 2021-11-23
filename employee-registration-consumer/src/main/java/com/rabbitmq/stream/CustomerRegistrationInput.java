package com.rabbitmq.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface CustomerRegistrationInput {
	public static final String INPUT = "customer-input-stream";

	@Input(INPUT)
	SubscribableChannel retreiveCustomer();
}
