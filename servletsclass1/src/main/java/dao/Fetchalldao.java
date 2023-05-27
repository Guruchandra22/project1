 package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Studentdto;

public class Fetchalldao {

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	public List<Studentdto> fetchall() {
		Query q1= em.createQuery("select data from Studentdto data");
		List<Studentdto> list=q1.getResultList();
		return list;
		
	}
	
}
 