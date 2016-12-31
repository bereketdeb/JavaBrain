package javaCods;

import java.lang.annotation.Annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsHobbyValid, String > {

	private String listofValidHoppies;
	@Override
	public void initialize(IsHobbyValid isHobbyValid) {
		this.listofValidHoppies = isHobbyValid.listofValidHoppies();
		
		
	}

	@Override
	public boolean isValid(String studentHoppy, ConstraintValidatorContext ctx) {
		
		if(studentHoppy== null){
			return false;
		}else if(studentHoppy.matches(listofValidHoppies)){
		//}else if(studentHoppy.matches("Music|Soccer|Criket")){
			return true;
		}
		
		return false;
		
	}

	
}
