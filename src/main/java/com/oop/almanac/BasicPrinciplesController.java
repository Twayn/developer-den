package com.oop.almanac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicPrinciplesController {
	@GetMapping("/basic_principles")
	public String index(Model model) {
		//model.addAttribute("arg", arg);
//		model.addAttribute("abstractionText", abstractionText);
//		model.addAttribute("polymorphismText", polymorphismText);
//		model.addAttribute("inheritanceText", inheritanceText);
//		model.addAttribute("incapsulationText", incapsulationText);
		return "basic";
	}

//	private String abstractionText = "Abstraction is...";
//	private String polymorphismText  = "Polymorphism is...";
//	private String inheritanceText  = "Inheritance is...";
//	private String incapsulationText  = "Incapsulation is...";
}
