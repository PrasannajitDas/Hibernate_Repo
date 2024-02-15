 package logInValidation;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Validate {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email:");
		String email=sc.next();
		System.out.println("Enter password:");
		String password=sc.next();
		
		Query query=em.createQuery("select u from User2 u where u.email=?1 and u.password=?2"); 
//																placeholder1	placeholder2
//		now this is incomplete query, we have to set the values.In JDBC, we are setting values according to 
//		datatypes, but in hibernate we have to use setParameter(placeholder, value) directly,hibernate will
//		directly set values implicitly.
		query.setParameter(1, email);
		query.setParameter(2, password);
		
		List<User2> user =query.getResultList();
//		now if the given credentials are correct, them in the list some data will be there and its size will be 
//		greater than 0, if wrong credentials then list size will be 0 only.
		
		
		if(user.size()>0) {
			System.out.println("Welcome to List");
		}
		else {
			System.out.println("Get lost");
		}
		
		
//		we can also use getSingleResult() because fetching only one row.-->return type is Object.
//		if credentials is correct, then some data will be there is the Object and if credentials is wrong then,
//		Object will be null.
//		Object user=query.getSingleResult();
//		if(user!=null) {
//			System.out.println("Welcome");
//		}else {
//			System.out.println("Get Lost");
//		}
	}

}
