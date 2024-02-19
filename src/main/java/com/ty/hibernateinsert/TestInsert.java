package com.ty.hibernateinsert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestInsert {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Student s=new Student();
	s.setRol(4);
	s.setName("Ritu");
	s.setEmail("rit@gmail.com");
	s.setHeight(5.7);
	
	et.begin();
	
	em.persist(s);
	
	
	et.commit();
	System.out.println("data saved");
}
}
