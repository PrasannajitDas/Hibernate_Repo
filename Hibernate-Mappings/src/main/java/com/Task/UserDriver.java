package com.Task;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		User user1=new User();
		user1.setName("Giri");
		user1.setEmail("raja@gmail.com");
		user1.setPassword("FG626");
		
		Cart cart1=new Cart();
		cart1.setName("Cart2");
		
		user1.setCart(cart1);
		cart1.setUser(user1);
		
		Item item1=new Item();
		item1.setBrand("Prada");
		item1.setCategory("Clothing");
		item1.setPrice(2500);
		item1.setCart(cart1);
		
		Item item2=new Item();
		item2.setBrand("Puma");
		item2.setCategory("SportsWear");
		item2.setPrice(2600);
		item2.setCart(cart1);
		
		List<Item> items=new ArrayList<Item>();
		items.add(item2);
		items.add(item1);
		
		cart1.setItem(items);
		
		double totalprice=item1.getPrice()+item2.getPrice();
		cart1.setTotalprice(totalprice);
		
		et.begin();
		em.persist(user1);
		em.persist(cart1);
		em.persist(item1);
		em.persist(item2);
		et.commit();
		
	}

}
