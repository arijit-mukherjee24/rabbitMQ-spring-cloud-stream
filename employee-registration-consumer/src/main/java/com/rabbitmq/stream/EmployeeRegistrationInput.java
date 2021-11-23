package com.rabbitmq.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;


public interface EmployeeRegistrationInput {
	public static final String INPUT = "employee-input-stream";

	@Input(INPUT)
	SubscribableChannel retreiveEmployee();
}
