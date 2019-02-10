package com.oop.almanac;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/content")
public class DataStructuresController {
	@GetMapping("/ds_sidenav")
	public String sidenav() {
		return "ds_sidenav";
	}

	@GetMapping("/o_notation")
	public String oNotation() {
		return "ds/o_notation";
	}

	@GetMapping("/array")
	public String array() {
		return "ds/array";
	}

	@GetMapping("/linked_list")
	public String linkedList() {
		return "ds/linked_list";
	}

	@GetMapping("/array_vs_linked")
	public String arrayVsLinked() {
		return "ds/array_vs_linked";
	}

	@GetMapping("/hash_map")
	public String hashMap() {
		return "ds/hash_map";
	}
}
