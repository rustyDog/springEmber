package com.usaa.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by rustidog
 */
@Document(collection = "memberData")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Member {
	@Id
	public String memberNumber;
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
	public List<Identification> identifications;
	public List<Product> products;
	
	public Member(){
	}
	
	public Member(String id, String firstName, String lastName, String dob, String ssn, 
			String email, String gender, String streetAddress, String state, String homePhone,
			String city, String country, String countryCode, String maritalStatus, String employer,
			String occupation, Military military, List<Identification> identifications, List<Product> products){
		this.memberNumber = id;
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
	
}
