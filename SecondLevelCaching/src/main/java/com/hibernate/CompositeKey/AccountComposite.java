package com.hibernate.CompositeKey;

import java.io.Serializable;
import java.util.Objects;

public class AccountComposite implements Serializable{
	private long accountnumber;
	private int pincode;

	private AccountComposite() {

	}

	public AccountComposite(long accountnumber, int pincode) {
		super();
		this.accountnumber = accountnumber;
		this.pincode = pincode;
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

	@Override
	public int hashCode() {
		return Objects.hash(accountnumber, pincode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountComposite other = (AccountComposite) obj;
		return accountnumber == other.accountnumber && pincode == other.pincode;
	}

	
	
	
	

}
