package com.course.rabbitmqproducer;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.course.rabbitmqproducer.model.Employee;
import com.course.rabbitmqproducer.producer.EmployeeJsonProducer;
import com.course.rabbitmqproducer.producer.HelloRabbitProducer;

@SpringBootApplication
//@EnableScheduling
public class RabbitmqProducerApplication implements CommandLineRunner {
	
	//@Autowired
	//private HelloRabbitProducer helloRabbitProducer;

	@Autowired
	private EmployeeJsonProducer employeeJsonProducer;
	
	public static void main(String[] args) {
		SpringApplication.run(RabbitmqProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//helloRabbitProducer.sendHello("Rohan "+Math.random());
		employeeJsonProducer.sendMessage(new Employee("1", "Rohan", new Date()));
	}

}
