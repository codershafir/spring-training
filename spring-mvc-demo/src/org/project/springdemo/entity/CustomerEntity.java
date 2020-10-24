package org.project.springdemo.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.project.springdemo.validator.BusinessCode;

public class CustomerEntity {

	@NotNull(message = "This field cannot be empty")
	@Size(min = 1, message = "The minimum size for this field is 1")
	private String firstName;

	private String lastName;

	@NotNull(message = "This field cannot be empty")
	@Min(value = 18, message = "The value should be above 18")
	@Max(value = 60, message = "The value should not be above 60")
	private Integer age;

	@Pattern(regexp = "^[0-9]{10}", message = "There should not be less than 10 characters")
	private String phoneNumber;

	@BusinessCode
	private String businessCode;

	public CustomerEntity() {

	}

	public String getBusinessCode() {
		return businessCode;
	}

	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
