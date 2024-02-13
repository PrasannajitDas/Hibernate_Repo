package com.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.secondlevelcacheing.Student;

public class FetchAllNotbasedonPrimaryK {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		javax.persistence.Query query=em.createQuery("select a from Student a");
		List<Student> students=query.getResultList();
		
		for(Student s:students) {
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println("----------------------");
		}
		
	}

}
