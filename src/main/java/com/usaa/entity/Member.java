package com.usaa.entity;


/**
 * Created by rustidog
 */
public class Member {
	public String id;
	public String firstName;
	public String lastName;
	public String dob; //Convert to Date?
	public String ssn;
	public String email;
	public String gender;
	public String streetAddress;
	public String state;
	public String homePhone;
	public String city;
	public String country;
	public String countryCode;
	public String maritalStatus;
	public String employer;
	public String occupation;
	public Military military;
	public Identification[] identifications;
	public Product[] products;
	
	public Member(){
	}
	
	public Member(String id, String firstName, String lastName, String dob, String ssn, 
			String email, String gender, String streetAddress, String state, String homePhone,
			String city, String country, String countryCode, String maritalStatus, String employer,
			String occupation, Military military, Identification[] identifications, Product[] products){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.ssn = ssn;
		this.email = email;
		this.gender = gender;
		this.streetAddress = streetAddress;
		this.state = state;
		this.homePhone = homePhone;
		this.city = city;
		this.country = country;
		this.countryCode = countryCode;
		this.maritalStatus = maritalStatus;
		this.employer = employer;
		this.occupation = occupation;
		this.military = military;
		this.identifications = identifications;
		this.products = products;
	}


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
	
}
