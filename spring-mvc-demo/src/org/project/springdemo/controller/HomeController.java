package org.project.springdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	String getHomePage() {
		return "home";
	}

	@RequestMapping("/showForm")
	String showForm() {
		return "form-page";
	}

	@RequestMapping("/processForm")
	String processForm(HttpServletRequest request, Model modelObject) {
		String studentName = request.getParameter("studentName");
		studentName = studentName.toUpperCase();
		modelObject.addAttribute("upperCaseName", studentName);
		return "result";
	}

	@RequestMapping("/processFormVersionTwo")
	String processForm(@RequestParam("studentName") String nameValue, Model modelObject) {
		nameValue = nameValue.toUpperCase();
		modelObject.addAttribute("upperCaseName", nameValue);
		return "result";
	}

}
