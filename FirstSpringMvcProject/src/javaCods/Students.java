package javaCods;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Students {
	
	@Pattern(regexp="[^(0-9)]*")
	private String studentName;
	@Size(min=3,max=5) //, message="Please insert characters from {min} to {max} only")
	// or we can take the message to "studentMessage.properties" file and indicate in the "spring-dispatcher-servlet.xml"
	@IsHobbyValid()
	private String studentHoppy;
	@Past
	private Date dob;
	private Address studentAddress;
	
	
	public Address getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public ArrayList<String> getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(ArrayList<String> skillSet) {
		this.skillSet = skillSet;
	}

	private ArrayList<String> skillSet;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentHoppy() {
		return studentHoppy;
	}

	public void setStudentHoppy(String studentHoppy) {
		this.studentHoppy = studentHoppy;
	}

	
	
	
}
