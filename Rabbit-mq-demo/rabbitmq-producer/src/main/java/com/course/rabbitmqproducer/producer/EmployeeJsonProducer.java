package com.course.rabbitmqproducer.producer;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.rabbitmqproducer.model.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmployeeJsonProducer {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void sendMessage(Employee employee) throws AmqpException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		rabbitTemplate.convertAndSend("course.employee",mapper.writeValueAsString(employee));
	}
	
}
