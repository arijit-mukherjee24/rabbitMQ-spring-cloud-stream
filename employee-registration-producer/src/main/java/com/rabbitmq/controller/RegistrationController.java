package com.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rabbitmq.model.Customer;
import com.rabbitmq.model.Employee;
import com.rabbitmq.stream.CustomerRegistrationSource;
import com.rabbitmq.stream.EmployeeRegistrationSource;

@RestController
@RequestMapping("/register")
@EnableBinding({ EmployeeRegistrationSource.class, CustomerRegistrationSource.class})
public class RegistrationController {

	@Autowired
	EmployeeRegistrationSource employeeRegistrationSource;
	
	@Autowired
	CustomerRegistrationSource customerRegistrationSource;

	@RequestMapping("/employee")
	@ResponseBody
	public String addEmp(@RequestBody Employee employee) {
		employeeRegistrationSource.employeeRegistration().send(MessageBuilder.withPayload(employee).build());
		System.out.println(employee.toString());
		return "Employee Registered";
	}
	
	@RequestMapping("/customer")
	@ResponseBody
	public String addCust(@RequestBody Customer customer) {
		customerRegistrationSource.customerRegistration().send(MessageBuilder.withPayload(customer).build());
		System.out.println(customer.toString());
		return "Customer Registered";
	}
}
