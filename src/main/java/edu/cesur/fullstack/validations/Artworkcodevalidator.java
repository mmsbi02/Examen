package edu.cesur.fullstack.validations;



import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(CLASS)
@Target(FIELD)
@Constraint(validatedBy =  Artworkcodevalidator.class)

public interface Artworkcodevalidator {
	
	  String mensaje() default "La descripcion debe tener 5 palabras";
	    Class<?>[] groups() default {};
	    Class <? extends Payload>[] paylaod() default{};
	}
	
	

}
