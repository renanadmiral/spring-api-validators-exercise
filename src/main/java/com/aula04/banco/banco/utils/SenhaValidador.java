package com.aula04.banco.banco.utils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Locale;

public class SenhaValidador implements ConstraintValidator<Senha, String> {
    @Override
    public void initialize(Senha constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String senha, ConstraintValidatorContext context) {
        if(senha == null ||
                senha.length() > 4 ||
                senha.length() == 0 ||
                senha.toLowerCase(Locale.ROOT).equals("nazi") ||
                senha.equals("000")){return  false;}
        return true;
    }
}
