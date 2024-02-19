package com.ty.hibernateinsert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ToDeleteREcord {
public static void main(String[] args) {
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	 EntityManager em=emf.createEntityManager();
	 EntityTransaction et=em.getTransaction();
	 
	 Student st=em.find(Student.class, 2);
	 if (st!=null) {
	et.begin();
	
	em.remove(st);
	
	et.commit();

	System.out.println("record got deleted");
	}
	 else
	 {
		 System.out.println("inavlid id");
	 }
}
}
