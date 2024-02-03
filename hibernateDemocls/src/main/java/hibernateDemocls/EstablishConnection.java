package hibernateDemocls;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EstablishConnection {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
//	  (to establish connection) (Helper Class)  (method)               ("persistence unit name")
//	  (internally it will go to the persistence file and search for the persistence unit name in the persistence file , if it is matching then
//	   it will establish the connection.)
		System.out.println("Connection Established");

	}

}
