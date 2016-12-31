package javaCods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.validation.BindingResult;

public class StoreData {
	static Students study;
	
	StoreData(Students studi){
		this.study =study;
	}
	
        
	public static void main(String[] args) {
		System.out.print("yy");
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran= session.beginTransaction();
		System.out.print("xx");
		Students student = new Students();
		Address add = new Address();
		
		StudentAdmissionController cont = new StudentAdmissionController();
		//Students study = cont.sendData();
		student.setStudentHoppy(study.getStudentHoppy());
		student.setStudentName(study.getStudentName());
		student.setDob(study.getDob());
		student.setSkillSet(study.getSkillSet());
		
		add.setCity(study.getStudentAddress().getCity());
		add.setState(study.getStudentAddress().getState());
		add.setCountry(study.getStudentAddress().getCountry());
		add.setZip(study.getStudentAddress().getZip()); 
		
		session.persist(student);
		session.persist(add);
		
		tran.commit();
		session.close();
		System.out.println("success");
		
		
		
		
		
		
		
		

	}

}
