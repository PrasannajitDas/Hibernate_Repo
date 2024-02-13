package com.FetchAll_NotBasedOnPK;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.secondlvlcacheingpractice.User;

public class UserDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("select x from User x");
		List<User> users = query.getResultList();

		System.err.println("id\tname\tage");
		for (User u : users) {
			System.out.println(u.getId()+"\t"+u.getName()+"\t"+u.getAge());
		}
	}
}
