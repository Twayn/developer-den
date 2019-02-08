package com.oop.almanac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/content")
public class OopController {
	@GetMapping("/oop_sidenav")
	public String oopSidenav() {
		return "oop_sidenav";
	}

	@GetMapping("/oop")
	public String oop() {
		return "oop/oop";
	}

	@GetMapping("/details")
	public String details() {
		return "oop/details";
	}

	@GetMapping("/principles")
	public String principles() {
		return "oop/principles";
	}
}
