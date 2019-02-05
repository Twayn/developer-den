package com.oop.almanac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/content")
public class SynopsisController {
	@GetMapping("/synopsis")
	public String synopsis() {
		return "synopsis";
	}
}
