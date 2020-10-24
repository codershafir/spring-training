package org.project.springdemo.controller;

import org.project.springdemo.entity.StudentEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/showStudentForm")
	String showForm(Model modelObject) {
		StudentEntity studentEntity = new StudentEntity();
		modelObject.addAttribute("studentEntity", studentEntity);
		return "student-registration-page";
	}

	@RequestMapping("/confirmDetails")
	String processForm(@ModelAttribute("studentEntity") StudentEntity studentEntity) {
		return "student-confirmation-page";
	}
}
