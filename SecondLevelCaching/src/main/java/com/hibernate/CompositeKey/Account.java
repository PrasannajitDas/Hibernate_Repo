package com.hibernate.CompositeKey;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(AccountComposite.class)
public class Account {
	
	private int id;
	private String name;
	@Id
	private long accountnumber;
	@Id
	private int pincode;
	private AccountComposite accountcomposite;
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
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public AccountComposite getAccountcomposite() {
		return accountcomposite;
	}
	public void setAccountcomposite(AccountComposite accountcomposite) {
		this.accountcomposite = accountcomposite;
	}
	
	

}
