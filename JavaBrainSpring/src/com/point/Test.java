package com.point;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		/*points point = new points();
		List<cordinates> cor = new ArrayList<>();
		cordinates cord1 = new cordinates();
		cord1.setX(0);
		cord1.setY(2);
		cor.add(cord1);
		cordinates cord2 = new cordinates();
		cord2.setX(5);
		cord2.setY(10);                           // collection java example
		cor.add(cord2);
		cordinates cord3 = new cordinates();
		cord3.setX(55);
		cord3.setY(10);
		cor.add(cord3);
		point.setCordinX(cor);
		point.drow(); */
		
		/*cordinates cord1 = new cordinates();
		cord1.setX(0);
		cord1.setY(2);
		cordinates cord2 = new cordinates();
		cord1.setX(5);
		cord1.setY(10);                           // normal java example
		
		points pointA  = new points();
		pointA.setCordinA(cord1);
		points pointB  = new points();
		pointA.setCordinB(cord2); */
	/*	
		registerShutdownHook() Spring Example
		In spring, registerShutdownHook() method is used to shut down IoC container 
		in non-web applications. It shuts down IoC container gracefully. 
		In non web based application like desk top application it is required to call registerShutdownHook. 
		In our desktop application we need to release all resources used by our spring application. 
		So we need to ensure that after application is finished, destroy method on our beans should be called. 
		In web-based application ApplicationContext already implements code to shut down the IoC container properly.
		But in desktop application we need to call registerShutdownHook to shutdown IoC container properly.*/ 

		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//context.registerShutdownHook();
		//points pointA = (points) context.getBean("point");
		Shape shape = (Shape) context.getBean("circle");
		shape.drow();
		System.out.println(context.getMessage("message", null, "Default message", null));
		
	/*
	  the third injection method is by coding Interface. by creating an interface and implementing its 
	  method to all available classes, we can create different shapes.	
	 */
		
		

	}

}
