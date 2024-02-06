package hibernateDemocls.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernateDemocls.Student;

//This Dao class can be connected with the database.

public class StudentDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void saveStudent(Student s) {

		et.begin();
		em.persist(s);
		et.commit();
	}

	public Student fetchStudentById(int id) {
		Student s = em.find(Student.class, id);
		return s;
	}

	public void deleteStudentById(int id) {
		Student s = fetchStudentById(id); // we can call a nonstatic method inside another nonstatic method. So here we are not again calling-
		if (s != null) {				  // find (), directly we are calling fetch method and performing the operations.	
			et.begin();
			em.remove(s);
			et.commit();
			System.out.println("Data Deleted Successfully...");
		} else {
			System.err.println("Invalid Id !!!");
		}

	}

	public void updateStudentById(Student s) {
		et.begin();
		em.merge(s);
		et.commit();
	}

}
