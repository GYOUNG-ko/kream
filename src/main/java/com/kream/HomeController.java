package com.kream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	public HomeController() {}
	
	@RequestMapping("/index")
	public void index() {}

	@RequestMapping("main")
	public String main() {
		return "/default/main";
	}
	
	@RequestMapping("header")
	public String header() {
		return "/default/header";
	}
	
	@RequestMapping("footer")
	public String footer() {
		return "/default/footer";
	}
	
}
