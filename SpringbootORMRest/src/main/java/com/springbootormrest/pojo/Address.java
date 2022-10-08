package com.springbootormrest.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="empAddress")

public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long eAddid;
	@NotNull
	public String address;
	
	@NotNull
	public String city;
	public String state;
	
	@NotNull
	public String pincode;
	
	@ManyToOne
	@JsonIgnore
	public Employee emp;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(String address, String city, String state, String pincode) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	

}
