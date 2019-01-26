package com.oop.almanac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OtherOopPrinciplesController {
	@GetMapping("/other_oop_principles")
	public String index(Model model) {
		return "other_oop_principles";
	}
}
