package com.usaa.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Identification {
	public String type;
	public int number;
	public boolean valid;
	
	public Identification(){
	}
	
	public Identification(String type, int number, boolean valid) {
		this.type = type;
		this.number = number;
		this.valid = valid;
	}
}
