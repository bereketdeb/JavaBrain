package com.point;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.brain.Triangle;

public class Test {

	public static void main(String[] args) {
		//Triangle tringle = new Triangle();
		//Triangle tringle = new Triangle();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.drow();
		System.out.print("success");

	}

}
