package hibernate.Cascading;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Person person=new Person();
		person.setName("Raja");
		
		Pan pan=new Pan();
		pan.setPannum("GUUBB445");
		pan.setAddress("Rajajinagar");
		
		person.setPan(pan);
		
		et.begin();
		em.persist(person);//Here we are only saving Person(source entity) and its related entity/target entity(Pan) is also saved i.e. target entity also getting affected.
		et.commit();
	}

}
