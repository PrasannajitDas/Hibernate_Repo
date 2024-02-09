package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student student1=new Student();
		student1.setName("Raj");
		student1.setAge(25);
		
		Student student2=new Student();
		student2.setName("Ankur");
		student2.setAge(30);
		
		Course course1=new Course();
		course1.setName("Java");
		course1.setDuration("6 months");
		
		Course course2=new Course();
		course2.setName("Python");
		course2.setDuration("4 months");
		
		List<Student> students=new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		
		List<Course> courses=new ArrayList<Course>();
		courses.add(course1);
		courses.add(course2);
		
		student1.setCourse(courses);
		student2.setCourse(courses);
		
		course1.setStudent(students);
		course2.setStudent(students);
		
		et.begin();
		em.persist(course1);
		em.persist(course2);
		em.persist(student1);
		em.persist(student2);
		et.commit();
		
	}

}
