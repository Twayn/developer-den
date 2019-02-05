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

	@GetMapping("/stub")
	public String stub() {
		return "oop_sidenav";
	}
}
