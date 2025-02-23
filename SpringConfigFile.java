package com.ty.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ty.beans.Address;
import com.ty.beans.Student;
import com.ty.beans.Subjects;
@Configuration
public class SpringConfigFile 
{
	@Bean
	public Address createAddrObj()
	{
		Address addr = new Address();
		addr.setLocation("Pune");
		addr.setPinCode(23455);
		addr.setState("Maharashtra");		
				
		return addr;	
	}
	@Bean
	public Student createStudObj()
	{
		Student std=new Student();
		std.setName("Aryan");
		std.setRollno(577);
		//std.setAddress(createAddrObj());

		return std;
		
	}
	@Bean
	public Subjects createSubjObj()
	{
		Subjects sub= new Subjects();
				List<String>Subject_List = new ArrayList<String>();
						Subject_List.add("JAVA");
				        Subject_List.add("PYTHON");
			         	Subject_List.add("ORACLE SQL");
			         	sub.setSubjects(Subject_List);
		
		return sub;
		
		
	}
		

}
