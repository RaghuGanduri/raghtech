package com.raghtech.bankapp.model;

import java.io.Serializable;

public class Account implements Serializable {
	private int accNo;
	private String name;
	
	public Account() {}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}