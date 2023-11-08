package edu.cesur.fullstack.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Artworkcodevali implements  ConstraintValidator<Artworkcodevalidator, String>{
	
	public void initialize(Artworkcodevali constraintAnnotation) {
    }


    @Override
    public boolean isValid(String valor, ConstraintValidatorContext context) {
        if (valor == null || valor.trim().isEmpty()) {

            return false;

            }

            String[] palabras = valor.trim().split("\s+");

            return palabras.length >= 5;

}

}
