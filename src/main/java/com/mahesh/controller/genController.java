package com.mahesh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class genController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Mahesh from Jenkins";
	}
}
