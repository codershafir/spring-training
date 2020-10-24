package org.project.springdemo.validator;

import java.util.Objects;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BusinessCodeValidator implements ConstraintValidator<BusinessCode, String> {

	private String businessCodeValue;

	@Override
	public void initialize(BusinessCode businessCode) {
		this.businessCodeValue = businessCode.value();
	}

	@Override
	public boolean isValid(String businessCode, ConstraintValidatorContext constraintValidatorContext) {
		boolean validationResult = false;
		if (Objects.nonNull(businessCode)) {
			if (businessCode.startsWith(businessCodeValue)) {
				validationResult = true;
			}
		} else {
			validationResult = true;
		}
		return validationResult;
	}

}
