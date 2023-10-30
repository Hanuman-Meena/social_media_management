package com.fb.jenkins.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	
	@GetMapping("/")
	@ResponseBody
	public String homeEndPoint() {
		
		return "Hi! Welcome to Woro Social Media Management Application!";
	}
	
	
}
