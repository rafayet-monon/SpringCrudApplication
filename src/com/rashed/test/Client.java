package com.rashed.test;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rashed.business.StudentBo;
import com.rashed.business.StudentBoImpl;
import com.rashed.model.Student;

public class Client {

	public static void main(String[] args) throws Exception {
		BasicConfigurator.configure();
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("com/rashed/resources/spring.xml");
		StudentBo stbo = (StudentBo) cap.getBean("bo");
		int i = stbo.createStudent(new Student(1202029, "Rashed", "golam.raashed@gmail.com", "Barisal"));
		System.out.println(i);
		cap.close();
	}

}
