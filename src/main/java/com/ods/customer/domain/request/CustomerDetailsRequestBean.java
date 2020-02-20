package com.ods.customer.domain.request;

import com.ods.customer.domain.pojo.Address;

public class CustomerDetailsRequestBean {

	private String name;
	private String surname;
	private String mono;
	private Address address;
	private String panNo;

	public CustomerDetailsRequestBean() {}
	
	public CustomerDetailsRequestBean(String name, String surname, String mono, Address address, String panNo) {
		super();
		this.name = name;
		this.surname = surname;
		this.mono = mono;
		this.address = address;
		this.panNo = panNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMono() {
		return mono;
	}

	public void setMono(String mono) {
		this.mono = mono;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

}
