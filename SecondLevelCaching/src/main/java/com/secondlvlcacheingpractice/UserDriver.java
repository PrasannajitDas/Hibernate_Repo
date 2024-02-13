package com.secondlvlcacheingpractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityManager em2=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
//		
//		User user=new User();
//		user.setName("Hari");
//		user.setAge(22);
//		
//		et.begin();
//		em.persist(user);
//		et.commit();
//		
		em.find(User.class, 1);
		em.find(User.class, 2);
		
		em2.find(User.class, 1);
		em2.find(User.class, 2);
//		(Now here, only 2 query will be written by hibernate.)
	}

}
