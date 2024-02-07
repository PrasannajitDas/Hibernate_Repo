package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student s1 = new Student();
		s1.setName("Raj");
		s1.setAge(22);

		Exam e1 = new Exam();
		e1.setName("Mathemetics");
		e1.setAddress("Cuttack");
		
		s1.setExam(e1);
		e1.setStudent(s1);

		et.begin();
		em.persist(s1);
		em.persist(e1);
		et.commit();
	}

}
