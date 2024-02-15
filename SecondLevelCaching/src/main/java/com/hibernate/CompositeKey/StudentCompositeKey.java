package com.hibernate.CompositeKey;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable//used to mark a class as composite primary key in hibernate 
public class StudentCompositeKey implements Serializable {
	private int id;
	private String name;

	public StudentCompositeKey() {
	}

	public StudentCompositeKey(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
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

}
