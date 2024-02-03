package hibernateDemocls;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student st1 = new Student(); // creating Object and setting the value
		st1.setId(101);
		st1.setName("Ramana");
		st1.setAge(22);
		st1.setYop(2013);

		et.begin(); // to get the block of memory in persistence context
		em.persist(st1); // to save the data
		et.commit(); // to save the data in database

	}

}
