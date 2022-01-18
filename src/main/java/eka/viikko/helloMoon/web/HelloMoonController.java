package eka.viikko.helloMoon.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloMoonController {
	@RequestMapping("index")
	@ResponseBody
	public String sayMainpage() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String sayContactpage() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHelloToSomeone(@RequestParam(name="location_name", required=false, defaultValue = "Muumi") String location,
			@RequestParam(name="nimi") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}

}