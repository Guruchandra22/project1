package practdao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import practdto.Practdto;

public class Practdao {
	
	EntityManagerFactory emfEntityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager emEntityManager=emfEntityManagerFactory.createEntityManager();
	EntityTransaction etEntityTransaction=emEntityManager.getTransaction();
	
	public void insert(Practdto practdto) {
	
		etEntityTransaction.begin();
		emEntityManager.persist(practdto);
		etEntityTransaction.commit();
		
	}

	public String delete(int id) {
		Practdto pract= emEntityManager.find(Practdto.class, id);
		if(pract!=null) {
			etEntityTransaction.begin();
			emEntityManager.remove(pract);
			etEntityTransaction.commit();
			return "data deleted";
		}
			else
			{
				return "data not found";
			}
	}

	public void update(int id, long num) {
		
	Practdto pract	=emEntityManager.find(Practdto.class, id);
	pract.setNumber(num);
	
	etEntityTransaction.begin();
	emEntityManager.persist(pract);
	etEntityTransaction.commit();
		
	}

	public Practdto fetch(int id) {
		Practdto practdto1= emEntityManager.find(Practdto.class, id);
		return practdto1;
	
	}

	public List<Practdto> fetchall() {
		Query q=emEntityManager.createQuery("select data from practtdto data");
		List<Practdto>l1=q.getResultList();
		return l1;
	}
}
