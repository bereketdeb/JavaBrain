package com.brain;

public class Triangle {
	
	private String Type;
	private int Length;
	
	public int getLength() {
		return Length;
	}

	Triangle(int Length){
		this.Length = Length;
	}
	
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public void drow(){
		System.out.println(getType()+" Triangle "+ getLength());
	}

}
