package com.usaa.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Military {
	public String branch;
	public String status;
	
	public Military(){			
	}
	
	public Military(String branch, String status) {
		this.branch = branch;
		this.status = status;
	}
}
