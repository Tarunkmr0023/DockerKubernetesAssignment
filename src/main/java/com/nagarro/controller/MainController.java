package com.nagarro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/home")
	public String handleGetRequest()
	{
		return "Tarun Kumar's Docker and Kubernetes Assignment is working fine";
	}
}
