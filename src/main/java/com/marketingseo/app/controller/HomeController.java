package com.marketingseo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marketingseo.app.models.entity.Home;
import com.marketingseo.app.models.service.IHomeServices;

@Controller
public class HomeController {
	
	
	
	@Autowired
	private IHomeServices homeServices;
	
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
	
	@RequestMapping(value="/admin")
	public String admin(Model model)
	{
		Home home=new Home();
		model.addAttribute("home", home);
		model.addAttribute("titulo", "Bienvenido administrador");
		return "admin";
	}
	
	@RequestMapping(value="/admin", method = RequestMethod.POST)
	public String guardar(Model model,Home home)
	{
		model.addAttribute("titulo", "ESTO YA ES POR POST");
		homeServices.save(home);
		return "redirect:admin";
	}
	
	

}
