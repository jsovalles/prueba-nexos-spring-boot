package com.nexos.springboot.web.app.interceptors;


import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidationException;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class DTOValidator {
  public static void validate(Object outFormat) throws ValidationException {
    ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    Validator validadorSalida = validatorFactory.getValidator();
    Set<ConstraintViolation<Object>> violacionesSalida = validadorSalida.validate(outFormat, new Class[0]);
    if (violacionesSalida != null && !violacionesSalida.isEmpty()) {
      ConstraintViolation<Object> primeraViolacion = violacionesSalida.iterator().next();
      if (primeraViolacion != null) {
        String propertyViolated = primeraViolacion.getPropertyPath().toString();
        String message = String.valueOf(propertyViolated) + " " + primeraViolacion.getMessage();
        String error = String.valueOf(propertyViolated) + " -> " + message;
        throw new ValidationException(error);
      } 
    } 
  }
}
