package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDetails {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Country c = em.find(Country.class, 1);
		System.err.println("CName\tCid\tCpopulation");
		System.out.println(c.getName() + "\t" + c.getId() + "\t" + c.getPopulation());

		Primeminister p = c.getPrimeminister();
		System.err.println("Pid\tPname\tPage");
		System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getAge());

	}

}
