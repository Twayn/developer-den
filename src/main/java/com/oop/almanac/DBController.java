package com.oop.almanac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/content")
public class DBController {
	@GetMapping("/db_sidenav")
	public String dbSidenav() {
		return "db_sidenav";
	}

	@GetMapping("/db")
	public String db() {
		return "db/db";
	}

	@GetMapping("/keys")
	public String keys() {
		return "db/keys";
	}

	@GetMapping("/normal_forms")
	public String normalForms() {
		return "db/normal_forms";
	}

	@GetMapping("/indexes")
	public String indexes() {
		return "db/indexes";
	}

	@GetMapping("/transactions")
	public String transactions() {
		return "db/transactions";
	}

	@GetMapping("/locks")
	public String locks() {
		return "db/locks";
	}
}
