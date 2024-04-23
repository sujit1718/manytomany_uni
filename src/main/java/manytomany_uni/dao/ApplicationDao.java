package manytomany_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class ApplicationDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("sujit").createEntityManager();
	}
}
