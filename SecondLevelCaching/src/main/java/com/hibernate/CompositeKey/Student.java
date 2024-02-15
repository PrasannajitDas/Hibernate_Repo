package com.hibernate.CompositeKey;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name="students")
public class Student {
	//embedded-->compressed collection of objects.
	@EmbeddedId //@EmbeddedId is used to specify hibernate that the class is a composite key.
	private StudentCompositeKey composite;
	private int age;
	private long mobilenumber;
	public StudentCompositeKey getComposite() {
		return composite;
	}
	public void setComposite(StudentCompositeKey composite) {
		this.composite = composite;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
}
