
package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Studentdto;

public class Studentdao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	public String insert(Studentdto dto) {
		et.begin();
		em.persist(dto);
		et.commit();
		return "data inserted successfully"; 
		
	}



	public Studentdto fetchbyid(int id1) {
	
		Studentdto dto1=em.find(Studentdto.class, id1);
		return dto1;
	}



	public void edit(Studentdto dto) {
		et.begin();
		em.merge(dto);
		et.commit();
		
	}



	public void remove(int cid) {
		Studentdto dto=em.find(Studentdto.class, cid);
		et.begin();
		em.remove(dto);
		et.commit();
	 
	
	}



	public String delete(int id) {
		Studentdto dto=em.find(Studentdto.class,id);
		if(dto!=null) {
			et.begin();
			em.remove(dto);
			et.commit();
			return "data deleted successfully";
		}
		else
			return "no data found";
	}



	public void update(int id, long num) {
		Studentdto dto=em.find(Studentdto.class,id);
		dto.setPhno(num);
		
		et.begin();
		em.persist(dto);
		et.commit();	 
	}



	public List<Studentdto> fetchAll() {
		// TODO Auto-generated method stub
	
			Query q1= em.createQuery("select data from Studentdto data");
			List<Studentdto> list=q1.getResultList();
			return list;
	  	
	}



	public void edit(int sid1, String sname, String gender, long phno1) {
		// TODO Auto-generated method stub
		
		et.begin();
		em.merge(null);
		et.commit();
	}



//	public void remove(cid) {
//		Studentdto dto=em.find(Studentdto.class, cid);
//		et.begin();
//		em.remove(dto);
//		et.commit();
//	
//	
//	}
	
	
	
	
	



	public void remove(String id) {
		Studentdto dto=em.find(Studentdto.class, id);
		et.begin();
		em.remove(dto);
		et.commit();
	
	
	}

	
}





