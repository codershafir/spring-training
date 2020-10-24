package org.project.springdemo.controller;

import javax.validation.Valid;

import org.project.springdemo.entity.CustomerEntity;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm")
	String showForm(Model modelObject) {
		CustomerEntity customerEntity = new CustomerEntity();
		modelObject.addAttribute("customerEntity", customerEntity);
		return "customer-form";
	}

	@RequestMapping("/confirmDetails")
	String processForm(@Valid @ModelAttribute("customerEntity") CustomerEntity customerEntity,
			BindingResult bindingResult) {
		return (bindingResult.hasErrors()) ? "customer-form" : "customer-confirmation";
	}

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

}
