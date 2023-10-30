package com.fb.jenkins.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@GetMapping("/")
	@ResponseBody
	public String homeEndPoint() {
		
		return "Hi! Welcome to Woro Social Media Management Application!";
	}
	
	@GetMapping("/home")
	@ResponseBody
	public String home() {
		
		return "welcome here!";
	}
	
	@GetMapping("/welcome/{name}")
	@ResponseBody
	public String welcome(@PathVariable("name")String name) {
		return "Hi! "+ name + "! Welcome to woro media family!!";
	}
}
