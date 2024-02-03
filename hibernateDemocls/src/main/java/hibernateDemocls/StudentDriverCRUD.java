package hibernateDemocls;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriverCRUD {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		System.out.println(
				"1.Add Student(Insert Data)\n2.View Student bt ID(Fetch Data)" + "\n3.Delete Data\n4.Update Data");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1:

			System.out.println("How many student want to add :");
			int count = sc.nextInt();

			for (int i = 1; i <= count; i++) {
				System.out.println("Enter id :");
				int id = sc.nextInt();

				System.out.println("Enter name :");
				String name = sc.next();

				System.out.println("Enter age :");
				int age = sc.nextInt();

				System.out.println("Enter yop :");
				int yop = sc.nextInt();

				Student s = new Student();
				s.setId(id);
				s.setName(name);
				s.setAge(age);
				s.setYop(yop);

				et.begin();
				em.persist(s);
				et.commit();

			}

			break;

		case 2:
			System.out.println("Enter id you want to fetch :");
			int id = sc.nextInt();
			Student s = em.find(Student.class, id);
			if (s != null) {
				System.out.println(s.getId());
			}

			break;

		}

	}

}
