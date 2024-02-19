package com.ty.hibernateinsert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ToUdatearecord {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	
	EntityTransaction et=em.getTransaction();
	
	Student st=em.find(Student.class,9);
	System.out.println("================================");
    if (st!=null) {
    	st.setHeight(5.7);
		et.begin();
		
		em.merge(st);
		 
		et.commit();
	}	
    else
    {
    	System.err.println("invalid id");
    }
	
	

}
}
