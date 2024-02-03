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

		System.out.println("1.Add Student(Insert Data)\n2.View Student by ID(Fetch Data)"
				+ "\n3.Delete student by Id(Delete Data)" + "\n4.Update Student by ID(Update Data)");
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
				System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getYop());
			} else {
				System.out.println("Invalid Id !");
			}

			break;

		case 3:
			System.out.println("Enter id to delete :");
			int id2 = sc.nextInt();
			Student s1 = em.find(Student.class, id2);
			if (s1 != null) {
				et.begin();
				em.remove(s1);
				et.commit();
			} else {
				System.out.println("Invalid Id");
			}

			break;

		case 4:
			System.out.println("Enter What do you want to Update :");
			System.out.println("1.Update Name\n2.Update Age\n3.Update YoP");
			int c = sc.nextInt();
			switch (c) {
			case 1:
				System.out.println("Enter id to update :");
				int id3 = sc.nextInt();
				Student s2 = em.find(Student.class, id3);
				System.out.println("Enter name to update :");
				String name = sc.next();
				if (s2 != null) {
					s2.setName(name);
					et.begin();
					em.merge(s2);
					et.commit();
				} else {
					System.out.println("Invalid Id");
				}
				break;

			case 2:
				System.out.println("Enter id to update :");
				int id4 = sc.nextInt();
				System.out.println("Enter age to update :");
				int age = sc.nextInt();
				Student s3 = em.find(Student.class, id4);
				if (s3 != null) {
					s3.setAge(age);
					et.begin();
					em.merge(s3);
					et.commit();
				} else {
					System.out.println("Invalid Id");
				}
				break;

			case 3:
				System.out.println("Enter id to update :");
				int id5 = sc.nextInt();
				System.out.println("Enter Yop to update :");
				int yop = sc.nextInt();
				Student s4 = em.find(Student.class, id5);
				if (s4 != null) {
					s4.setYop(yop);
					et.begin();
					em.merge(s4);
					et.commit();
				} else {
					System.out.println("Invalid Id");
				}
				break;

			default:
				System.out.println("Invalid Input !");

			}
		}

	}

}
