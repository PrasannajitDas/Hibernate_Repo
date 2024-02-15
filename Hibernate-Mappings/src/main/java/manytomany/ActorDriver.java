package manytomany;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ActorDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
	}

}
