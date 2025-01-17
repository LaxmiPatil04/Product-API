package com.telusko.myFirstWeb.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public String greet() {
		return "Welcome to Home controller!!!";
	}
	
	@RequestMapping("/home/about")
	public String about() {
		return "About detailes for Home Controller";
	}
	
}
