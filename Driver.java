package com.ty.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.beans.Student;
import com.ty.resources.SpringConfigFile;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std = context.getBean(Student.class);
		std.Display();	
		
				}

}
