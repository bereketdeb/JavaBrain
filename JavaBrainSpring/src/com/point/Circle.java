package com.point;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
	private cordinates cordinA;

	

	public cordinates getCordinA() {
		return cordinA;
	}


    @Required
	@Autowired
	@Qualifier("CircleRelated")
	public void setCordinA(cordinates cordinA) {
		this.cordinA = cordinA;
	}



	@Override
	public void drow() {
		System.out.println(getCordinA().getX()+" , " + getCordinA().getY());
		
	}
}
