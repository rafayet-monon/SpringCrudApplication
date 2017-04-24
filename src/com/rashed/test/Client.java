package com.rashed.test;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rashed.business.StudentBo;
import com.rashed.model.Student;

public class Client {

	public static void main(String[] args) throws Exception {
		BasicConfigurator.configure();
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("com/rashed/resources/spring.xml");
		StudentBo stbo = (StudentBo) cap.getBean("bo");
//		int i = stbo.createStudent(new Student(104, "Rashed", "golam.raashed@gmail.com", "Barisal"));
//		System.out.println(i);
                
                boolean x = stbo.updateStudent(new Student(101, "Rashu", "rashu@gmail.com", "Barisal"));
                System.out.println(x);
                
		cap.close();
	}

}
