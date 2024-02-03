package hibernateDemocls;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDataDynamically {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 3; i++) {

			Student s = new Student(); // Here each time we are creating different Objects.

			System.out.println("Enter id :");
			int id = sc.nextInt();

			System.out.println("Enter name :");
			String name = sc.next();

			System.out.println("Enter age :");
			int age = sc.nextInt();

			System.out.println("Enter Yop :");
			int yop = sc.nextInt();

			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setYop(yop);

			et.begin();
			em.persist(s);
			et.commit();
		}

	}

}
