package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CitizenDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Citizen citizen=new Citizen();
		citizen.setGender("Male");
		citizen.setName("Ram");
		citizen.setNationality("Indian");
		
		Adhar adhar=new Adhar();
		adhar.setNum(4521);
		adhar.setAddress("BCpur");
		
		citizen.setAdhar(adhar);
		adhar.setCitizen(citizen);
		
		et.begin();
		em.persist(citizen);
		em.persist(adhar);
		et.commit();
		
	}

}
