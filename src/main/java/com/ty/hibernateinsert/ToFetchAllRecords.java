package com.ty.hibernateinsert;

import java.util.List;

import javax.persistence.EntityManager;  
import javax.persistence.EntityManagerFactory; 
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ToFetchAllRecords {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	
	Query query=em.createQuery("from Student");
	
	List<Student> students=query.getResultList();
	System.out.println("--------------------------------------------");
	for (Student student : students) {
		System.out.println("student name is "+student.getName());
		System.out.println("roll no is "+student.getRol());
		System.out.println("email id is "+student.getEmail());
		System.out.println("height is "+student.getHeight());
		System.out.println("====================");
		
	}
	
	
}
}
