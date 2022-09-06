package com.prog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employe {
@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String address;
private String email;
private String phno;
private int salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Employe(int id, String name, String address, String email, String phno, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.email = email;
	this.phno = phno;
	this.salary = salary;
}
public Employe(String name, String address, String email, String phno, int salary) {
	super();
	this.name = name;
	this.address = address;
	this.email = email;
	this.phno = phno;
	this.salary = salary;
}
public Employe() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employe [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phno=" + phno
			+ ", salary=" + salary + "]";
}


}
