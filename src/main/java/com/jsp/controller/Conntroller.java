package com.jsp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Conntroller {

	@GetMapping("/")
	public String getMSG() {
		return "Project in Running State ";
	}
}
