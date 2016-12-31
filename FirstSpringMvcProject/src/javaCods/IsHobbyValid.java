package javaCods;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsHobbyValid {
	
	/* if we add (default "Music|Soccer|Criket") to "listofValidHoppies()" as shown below
	 * then @IsHobbyValid annotation can be written with out paramter, otherwise it will be compiler error
	 */
	 
	String listofValidHoppies() default "Music|Soccer|Criket";
	//String listofValidHoppies();
	/*we added this "listofValidHoppies" method inorder to put "Music|Soccer|Criket" as parameters.
	 * steps are:
	 * - create "String listofValidHoppies();" method here
	 * - replace the annotation "@IsHobbyValid" with parameterized annotation @IsHobbyValid(listofValidHoppies="Music|Soccer|Criket")
	 * - implement the "String listofValidHoppies();" method in the "Initialize" method of the "HobbyValidation" class
	 * - replace the hard coded "Music|Soccer|Criket" with listofValidHoppies
	 */
	
	String message() default "Pleas provide a valid hobby; "
			+ "accepted hobbies are - Music, Criket, and Soccer( choose one)";
	
	Class<?> []groups() default{}; 
	Class<? extends Payload>[] payload() default{};

}
