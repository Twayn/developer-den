package com.oop.almanac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OopController {
	@GetMapping("/oop_sidenav")
	public String oopSidenav() {
		return "oop_sidenav";
	}

	@GetMapping("/stub")
	public String stub() {
		return "oop_sidenav";
	}
}
