package com.marketingseo.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String home()
	{
		return "index";
	}
	
	
	@RequestMapping(value="/blog")
	public String blog()
	{
		return "blog";
	}
	
	@RequestMapping(value="/contacto")
	public String contacto(Model model)
	{
		model.addAttribute("titulo", "CONTACTO");
		return "contacto";
	}

}
