package hibernateDemocls;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDataDynamically {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		System.out.println("Enter id to update :");
		int id = new Scanner(System.in).nextInt();
		System.out.println("Enter new name :");
		String name = new Scanner(System.in).next();

		/*
		 * Student s = new Student(); s.setId(id); s.setName(name); (Here we are
		 * creating the new Object , in Object 4 var are there but we are setting only 2
		 * var, so remaining values it is taking as default values according to the
		 * datatypes, that's why it will update the name but it remaining columns will
		 * also be set as default according to datatypes.)
		 */

		Student s = em.find(Student.class, id);
		s.setName(name);
		/*
		 * (So here we are first fetching the data based on the id, then we are just
		 * updating the name and saving the data in the database, so now it will update
		 * only name and rest all will be as same as before.)
		 */

		et.begin();
		em.merge(s);
		et.commit();

	}

}
