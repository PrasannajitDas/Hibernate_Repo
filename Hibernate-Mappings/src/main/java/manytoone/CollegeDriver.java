package manytoone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CollegeDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		College college=new College();
		college.setName("IIM Banglore");
		college.setPrincipal("Dr.M.Chidambaram");
		
		Student student1=new Student();
		student1.setName("Ram");
		student1.setDegree("B.Tech");
		student1.setStream("CSE");
		student1.setCollege(college);
		
		Student student2=new Student();
		student2.setName("Sam");
		student2.setDegree("MCA");
		student2.setStream("Mechanical");
		student2.setCollege(college);
		
		List<Student> students=new ArrayList<Student>();
		students.add(student1);
		students.add(student2);
		
		college.setStudents(students);
		
		et.begin();
		em.persist(college);
		em.persist(student1);
		em.persist(student2);
		et.commit();
	}

}
