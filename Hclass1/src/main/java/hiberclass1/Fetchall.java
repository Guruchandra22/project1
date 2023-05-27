package hiberclass1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import antlr.collections.List;

public class Fetchall {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	TypedQuery<student> q=em.createQuery("Select student from Student_details",student.class);
//	List<student>listtable=q.getResultList();
//	for(student t:listtable) {
//	System.out.println("Student_id"+":"+t.getSno()+" "+"Student_name"+":"+t.getSname()+" "+"Student_marks"+":"+t.getSmarks());
	}
}

