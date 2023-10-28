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
		
		return "Hello  World! Welcome to Woro Media!";
	}
	
	@GetMapping("/home")
	@ResponseBody
	public String home() {
		
		return "This is Woro Social Medial Management Application to manage your all social media accounts at one place!";
	}
	
	@GetMapping("/welcome/{name}")
	@ResponseBody
	public String welcome(@PathVariable("name")String name) {
		return "Hi "+ name + "! Welcome to woro media family!!";
	}
}
