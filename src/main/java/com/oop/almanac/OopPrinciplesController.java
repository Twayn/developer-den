package com.oop.almanac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OopPrinciplesController {
	@GetMapping("/oop_sidenav")
	public String basicSidenav() {
		return "oop_sidenav";
	}

	@GetMapping("/stub")
	public String stub() {
		return "oop_sidenav";
	}
}
