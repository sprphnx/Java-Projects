package com.course.rabbitmqconsumer.consumer;

import java.io.IOException;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.course.rabbitmqconsumer.model.Employee;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmployeeJsonConsumer {

	@RabbitListener(queues = "course.employee")
	public void listen(String employeeJson) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		Employee employee = mapper.readValue(employeeJson, Employee.class);
		System.out.println("Employee from Rabbit MQ: "+employee.getId()+", "+employee.getName()+", "+employee.getDate());
	}
	
}
