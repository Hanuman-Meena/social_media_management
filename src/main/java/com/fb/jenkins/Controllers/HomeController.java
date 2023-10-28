package com.fb.jenkins.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/home")
	@ResponseBody
	public String home() {
		
		return "Hello World! This is woro media application!";
	}
	
	@GetMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "Welcome to woro media!!";
	}
}
