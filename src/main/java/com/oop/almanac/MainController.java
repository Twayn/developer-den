package com.oop.almanac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/")
	public String index(@RequestParam(name="arg", required=false, defaultValue="default") String arg, Model model) {
		model.addAttribute("arg", arg);
		model.addAttribute("abstractionText", abstractionText);
		model.addAttribute("polymorphismText", polymorphismText);
		model.addAttribute("inheritanceText", inheritanceText);
		model.addAttribute("incapsulationText", incapsulationText);
		return "index";
	}

	private String abstractionText = "Abstraction is...";
	private String polymorphismText  = "Polymorphism is...";
	private String inheritanceText  = "Inheritance is...";
	private String incapsulationText  = "Incapsulation is...";
}
