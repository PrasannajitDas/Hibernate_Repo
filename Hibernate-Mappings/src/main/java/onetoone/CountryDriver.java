package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CountryDriver {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Country country1 = new Country();
		country1.setId(1);
		country1.setName("Bharat");
		country1.setPopulation("140 Crores");

		Country country2 = new Country();
		country2.setId(2);
		country2.setName("France");
		country2.setPopulation("50 Crores");

		Primeminister pm1 = new Primeminister();
		pm1.setId(1);
		pm1.setName("Modi");
		pm1.setAge(74);

		Primeminister pm2 = new Primeminister();
		pm2.setId(2);
		pm2.setName("Fransis");
		pm2.setAge(62);

		country1.setPrimeminister(pm1);
		country2.setPrimeminister(pm2);

		et.begin();
		em.persist(country1);
		em.persist(country2);
		em.persist(pm1);
		em.persist(pm2);
		et.commit();

	}

}
