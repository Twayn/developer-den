package com.oop.almanac;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/*")
	public String index(Model model) {
//	  	(@RequestParam(name="arg", required=false, defaultValue="default") String arg, Model model) {
		return "index";
	}
}
