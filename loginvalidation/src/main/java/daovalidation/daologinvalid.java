package daovalidation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import dtovalidation.dtologinvalidation;

public class daologinvalid {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();

	public void signin(dtologinvalidation dto) {

			et.begin();
			em.persist(dto);
			et.commit();
			
		
	}

	public dtologinvalidation login(String email) {
		
		dtologinvalidation dt= em.find(dtologinvalidation.class, email);
		return dt;
		
		
	}

}
