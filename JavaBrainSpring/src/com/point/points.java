package com.point;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class points implements Shape {
	
	/*
	private List<cordinates> cordinX;

	public List<cordinates> getCordinX() {
		return cordinX;
	}                                                 // using list method

	public void setCordinX(List<cordinates> cordinX) {
		this.cordinX = cordinX;
	}
	
	*/
	
	private cordinates cordinA, cordinB, cordinC;
	public cordinates getCordinA() {
		return cordinA;
	}
	public void setCordinA(cordinates cordinA) {
		this.cordinA = cordinA;
	}
	public cordinates getCordinB() {
		return cordinB;
	}
	public void setCordinB(cordinates cordinB) {
		this.cordinB = cordinB;
	}
	public cordinates getCordinC() {
		return cordinC;
	}
	public void setCordinC(cordinates cordinC) {
		this.cordinC = cordinC;
	}
	
	public void drow(){
		System.out.println(getCordinA().getX()+" , " + getCordinA().getY());
		System.out.println(getCordinB().getX()+" , " + getCordinB().getY());
		System.out.println(getCordinC().getX()+" , " + getCordinC().getY());
	}
	
	public void initMeth(){
		System.out.println("initialization is called");
	}
	
	public void cleanUp(){
		System.out.println("Destroy is called");
	}
	
	/*public void drow(){
		for(cordinates cordi: cordinX){
			System.out.println(cordi.getX()+" , " + cordi.getY());
			
		}*/
	

}
