package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BranchDriver {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Hospital h=new Hospital();
		h.setCeo("Sundar");
		h.setName("Apollo");
		
		Branch b1=new Branch();
		b1.setName("Apollo-Marathahalli");
		b1.setPincode(560037);
		b1.setHospital(h);
		
		Branch b2=new Branch();
		b2.setName("Apollo-Jajput");
		b2.setPincode(457781);
		b2.setHospital(h);
		
		et.begin();
		em.persist(h);
		em.persist(b1);
		em.persist(b2);
		et.commit();
		
	}

}
