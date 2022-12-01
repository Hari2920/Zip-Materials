package com.gl.Authorization.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class BasicAuthController {
	@GetMapping(value="/index")
	public ModelAndView showIndexPage() {
		return new ModelAndView("index");
	}
	
	@GetMapping(value="/home")
	public ModelAndView showHomePage() {
		return new ModelAndView("homePage");
	}
	
	@GetMapping(value="/loginpage")
	 public ModelAndView showLoginPage() {
		 return new ModelAndView("loginPage");
	 }
	
	@GetMapping(value="/loginerror")
	 public ModelAndView showErrorPage() {
		 return new ModelAndView("loginErrorPage");
	 }

}