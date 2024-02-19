package com.ty.hibernateinsert;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class toFetcOneRecord {
public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
	System.out.println("eneter the student id to find the details");
	int id=sc.nextInt();
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
	EntityManager em=emf.createEntityManager();
	Student st=em.find(Student.class, id);
	System.out.println("============================");
	if (st!=null) {
		System.out.println(st.getName()+" "+st.getRol()+" "+st.getEmail()+" "+st.getHeight());
	}
	else
	{
		System.out.println("no student is thr of thhat id");
	}
}
}
