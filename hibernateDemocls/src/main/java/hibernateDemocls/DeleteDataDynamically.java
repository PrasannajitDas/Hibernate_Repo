package hibernateDemocls;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteDataDynamically {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		System.out.println("Enter id to delete :");
		int id = new Scanner(System.in).nextInt();

		Student s = em.find(Student.class, id);

		et.begin();
		em.remove(s);
		et.commit();
	}

}
