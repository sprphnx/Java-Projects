package com.course.rabbitmqproducer.model;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{

	private static final long serialVersionUID = 4587743381454286909L;

	private String id;
	private String name;
	private Date date;
	
	public Employee(String id, String name, Date date) {
		super();
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
