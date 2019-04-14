package com.course.rabbitmqconsumer.model;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{

	private static final long serialVersionUID = -4750102076641483553L;

	private String id;
	private String name;
	private Date date;

	public Employee() {
		super();
	}

	public Employee(String id, String name, Date date) {
		this.id = id;
		this.name = name;
		this.date = date;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}