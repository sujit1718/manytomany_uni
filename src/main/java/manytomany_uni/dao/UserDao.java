package manytomany_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomany_uni.dto.Application;
import manytomany_uni.dto.User;

public class UserDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("sujit").createEntityManager();
	}
	
	public void saveUser(User user, User user1, User user2) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		List<Application> list = user.getLis();
		List<Application> list1 = user1.getLis();
		List<Application> list2 = user2.getLis();
		transaction.begin();
		for (Application application : list) {
			manager.persist(application);
		}
		for (Application application : list1) {
			manager.persist(application);
		}
		for (Application application : list2) {
			manager.persist(application);
		}
		manager.persist(user);
		manager.persist(user1);
		manager.persist(user2);
		transaction.commit();
	}
}
