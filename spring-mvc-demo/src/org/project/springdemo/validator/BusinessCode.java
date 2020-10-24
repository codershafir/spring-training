package org.project.springdemo.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = BusinessCodeValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface BusinessCode {

	public String value() default "BUS";

	public String message() default "The code should start with BUS";

	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};

}
