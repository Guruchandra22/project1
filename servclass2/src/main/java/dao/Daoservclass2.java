package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Dtoservclass2;

public class Daoservclass2 {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	public void insert(Dtoservclass2 dto2) {
		et.begin();
		em.persist(dto2);
		et.commit();
		
	}
}
