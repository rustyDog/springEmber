package com.usaa.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by rustidog
 */
@Document(collection = "memberData")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Member {
	@Id
	public String memberNumber;
	@Field("first_name")
	public String firstName;
	@Field("last_name")
	public String lastName;
	public String dob; //Convert to Date?
	public String ssn;
	public String email;
	public String gender;
	@Field("street_address")
	public String streetAddress;
	public String state;
	@Field("home_phone")
	public String homePhone;
	public String city;
	public String country;
	@Field("country_code")
	public String countryCode;
	@Field("marital_status")
	public String maritalStatus;
	public String employer;
	public String occupation;
	public Military military;
	public List<Identification> identification;
	public List<Product> product;
	
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
		this.identification = identifications;
		this.product = products;
	}
	
}
