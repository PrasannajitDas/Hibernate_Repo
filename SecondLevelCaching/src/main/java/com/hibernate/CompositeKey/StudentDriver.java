package com.hibernate.CompositeKey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		StudentCompositeKey composite1=new StudentCompositeKey(2,"B");
		StudentCompositeKey composite2=new StudentCompositeKey(3,"C");
		
		Student s1=new Student();
		s1.setComposite(composite1);
		s1.setAge(22);
		s1.setMobilenumber(11445);
		
		Student s2=new Student();
		s2.setComposite(composite2);
		s2.setAge(25);
		s2.setMobilenumber(44558);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		et.commit();
	}
}
