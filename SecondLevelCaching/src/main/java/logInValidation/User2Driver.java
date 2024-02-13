package logInValidation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class User2Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		User2 user2=new User2();
		user2.setName("C");
		user2.setEmail("C@gmail.com");
		user2.setPassword("12355");
		
		et.begin();
		em.persist(user2);
		et.commit();
	}

}
