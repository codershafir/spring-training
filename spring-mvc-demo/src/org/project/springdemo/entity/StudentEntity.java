package org.project.springdemo.entity;

import java.util.LinkedHashMap;

public class StudentEntity {

	private String firstName;

	private String lastName;

	private String countryName;

	private LinkedHashMap<String, String> countryOptions;

	private String gender;

	private LinkedHashMap<String, String> genderOptions;

	private String[] subjectList;

	private LinkedHashMap<String, String> subjectOptions;

	public StudentEntity() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("IND", "India");
		countryOptions.put("USA", "America");
		countryOptions.put("UAE", "Saudi Arabia");
		countryOptions.put("NZ", "New Zealand");
		countryOptions.put("CAN", "Canada");

		genderOptions = new LinkedHashMap<>();
		genderOptions.put("Male", "Male");
		genderOptions.put("Female", "Female");
		genderOptions.put("Other", "Other");

		subjectOptions = new LinkedHashMap<>();
		subjectOptions.put("CSE", "Computer Science");
		subjectOptions.put("BIO", "Biology");

	}

	public String[] getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(String[] subjectList) {
		this.subjectList = subjectList;
	}

	public LinkedHashMap<String, String> getSubjectOptions() {
		return subjectOptions;
	}

	public void setSubjectOptions(LinkedHashMap<String, String> subjectOptions) {
		this.subjectOptions = subjectOptions;
	}

	public LinkedHashMap<String, String> getGenderOptions() {
		return genderOptions;
	}

	public void setGenderOptions(LinkedHashMap<String, String> genderOptions) {
		this.genderOptions = genderOptions;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
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

}
