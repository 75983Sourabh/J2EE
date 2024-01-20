package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {
@GetMapping("/hello")
public ModelAndView sayHello() {
	System.out.println("SayHello is called");
	String s="Hello World from Controller ";
	return new ModelAndView("hello","msg",s );
	
}
@GetMapping("Test")
public String method(Model m) {
	m.addAttribute("msg","hello");
	m.addAttribute("num1",10);
	m.addAttribute("num2",20);
	return "testAddition";
}

}