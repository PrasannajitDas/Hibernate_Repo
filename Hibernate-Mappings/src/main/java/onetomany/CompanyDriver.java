package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Company company1=new Company();
		company1.setName("EightFoldAI");
		company1.setCeo("Alexandar");
		
		Employee employee1=new Employee();
		employee1.setName("Ram");
		employee1.setRole("Developer");
		employee1.setYoe(5);
		
		Employee employee2=new Employee();
		employee2.setName("Sam");
		employee2.setRole("Consultant");
		employee2.setYoe(2);
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(employee2);
		employees.add(employee1);
		
		company1.setEmployee(employees);
		
		et.begin();
		em.persist(company1);
		em.persist(employee1);
		em.persist(employee2);
		et.commit();
		
	}

}
