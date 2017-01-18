package com.usaa.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	public String type;
	public int number;
	
	public Product(){
	}
	
	public Product(String type, int number) {
		this.type = type;
		this.number = number;
	}
}
