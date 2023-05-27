package hybernatevid1class;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Student s=new Student();
	s.setSid(4);
	s.setSname("ddd");
	s.setSmarks(80);
	
//	s.setSid(5);
//	s.setSname("eee");
//	s.setSmarks(70);
	
	
	
	et.begin();
	em.persist(s);
	et.commit();
	System.out.println("value inserted");
}
}
