package com.oop.almanac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SynopsisController {
	@GetMapping("/synopsis")
	public String synopsis() {
		return "synopsis";
	}
}
