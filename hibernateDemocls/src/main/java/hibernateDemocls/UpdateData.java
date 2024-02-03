package hibernateDemocls;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student s = new Student();
		s.setId(103); // here primary key 102 exists in database so merge() will update the data
		s.setName("Sam");
		s.setAge(27);
		s.setYop(2007);

		Student s1 = new Student();
		s1.setId(105); // here primary key 105 not exists so merge() will save the data
		s1.setAge(41);
		s1.setName("Rakesh");
		s1.setYop(2005);

		et.begin();
		em.merge(s1);
		et.commit();

	}

}
