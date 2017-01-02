package com.testSpring;

public class Employee {
	
	private String address;
	private int age;
	
	public Employee(int age ){
		this.age = age;
		//System.out.print("what");
	}
	public Employee(String address ){
		this.address = address;
		
	}
	
	public Employee(String address, int age ){
		this.address = address;
		this.age = age;
		
	}
	
	
	
	
	/*public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		
		return address;
	}*/
	
	public void getInfo(){
		System.out.print(address+" , "+ age);
	}
}
