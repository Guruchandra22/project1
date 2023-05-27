package hiberclass1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class fetchthevalue {
	public static void main(String[] args) {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
//	EntityTransaction et=em.getTransaction();
	
	  student  t=em.find(student.class,101);
	System.out.println("Student_id"+":"+t.getSno()+" "+"Student_name"+":"+t.getSname()+" "+"Student_smarks"+":"+t.getSmarks());
}
} 