package hiberclass1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insertvalue {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	student s=new student();
	s.setSno(101);
	s.setSname("guru");
	s.setSmarks(83.35);
	
	s.setSno(102);
	s.setSname("huuu");
	s.setSmarks(72.35);
	
	et.begin();
	em.persist(s);
	et.commit();
	System.out.println("value inserted");
	
}
}
