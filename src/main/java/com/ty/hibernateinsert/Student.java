package com.ty.hibernateinsert;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
private int rol;
private String name;
private String email;
private double height;
public int getRol() {
	return rol;
}
public void setRol(int rol) {
	this.rol = rol;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}

	
	
}
