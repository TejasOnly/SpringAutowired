package com.ty.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String Name;
	private int Rollno;
	@Autowired
	@Qualifier("createAddrObj")
	private Address address;
	@Autowired
	private Subjects subjects;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}	
	
	public void Display()
	{
		System.out.println("Name :"+Name);
		System.out.println("Rollno :"+Rollno);
		System.out.println("Address :"+address);
		System.out.println("Subjects :"+subjects);
	}	
}
