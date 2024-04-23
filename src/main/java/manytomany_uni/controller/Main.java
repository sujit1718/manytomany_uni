package manytomany_uni.controller;

import java.util.ArrayList;
import java.util.List;

import manytomany_uni.dao.UserDao;
import manytomany_uni.dto.Application;
import manytomany_uni.dto.User;

public class Main {

	public static void main(String[] args) {
		

		Application a1 = new Application();
		a1.setId(101);
		a1.setName("Facebook");
		a1.setCompany("Meta");
		
		Application a2 = new Application();
		a2.setId(102);
		a2.setName("Instagram");
		a2.setCompany("Meta");
		
		Application a3 = new Application();
		a3.setId(103);
		a3.setName("WhatsApp");
		a3.setCompany("Meta");
		
		Application a4 = new Application();
		a4.setId(104);
		a4.setName("SnapChat");
		a4.setCompany("Snapchat");
		
		List<Application> list = new ArrayList<Application>();
		list.add(a2);
		list.add(a3);
		
		User user = new User();
		user.setId(1);
		user.setName("om");
		user.setPhone(98786756);
		user.setAddress("Pune");
		user.setLis(list);
		
		List<Application> list1 = new ArrayList<Application>();
		list1.add(a1);
		list1.add(a2);
		list1.add(a3);
		list1.add(a4);
		User user1 = new User();
		user1.setId(2);
		user1.setName("Adi");
		user1.setPhone(98786756);
		user1.setAddress("Beed");
		user1.setLis(list1);
		
		List<Application> list2 = new ArrayList<Application>();
		list2.add(a1);
		list2.add(a3);
		list2.add(a4);
		
		User user2 = new User();
		user2.setId(3);
		user2.setName("Ajit");
		user2.setPhone(912386756);
		user2.setAddress("Latur");
		user2.setLis(list2);
		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sujit");
//     	EntityManager manager = factory.createEntityManager();
//    	EntityTransaction transaction = manager.getTransaction();
//    	
//    	transaction.begin();
//    	manager.persist(a1);
//    	manager.persist(a2);
//    	manager.persist(a3);
//    	manager.persist(a4);
//    	manager.persist(user);
//    	manager.persist(user1);
//    	manager.persist(user2);
//    	transaction.commit();
		
		UserDao dao = new UserDao();
		dao.saveUser(user, user1, user2);
	}

}
