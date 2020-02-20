package com.ods.customer.domain.response;

import com.ods.customer.domain.pojo.Address;

public class CustomerDetailsResponseBean {
	private int id;
	private String name;
	private Address address;

	public CustomerDetailsResponseBean(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
