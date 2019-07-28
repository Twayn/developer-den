package com.oop.almanac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/content")
public class DevelopmentController {
	@GetMapping("/development_sidenav")
	public String oopSidenav() {
		return "development_sidenav";
	}

	@GetMapping("/agile")
	public String agile() {
		return "development/agile";
	}

	@GetMapping("/xp")
	public String xp() {
		return "development/xp";
	}

	@GetMapping("/tdd")
	public String tdd() {
		return "development/tdd";
	}

	@GetMapping("/scrum")
	public String scrum() {
		return "development/scrum";
	}

	@GetMapping("/fdd")
	public String fdd() {
		return "development/fdd";
	}

	@GetMapping("/bdd")
	public String bdd() {
		return "development/bdd";
	}

	@GetMapping("/kanban")
	public String kanban() {
		return "development/kanban";
	}

	@GetMapping("/devops")
	public String devops() {
		return "development/devops";
	}

	@GetMapping("/testing")
	public String testing() {
		return "development/testing";
	}
}
