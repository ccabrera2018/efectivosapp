package com.marketingseo.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marketingseo.app.models.entity.Menu;
import com.marketingseo.app.models.service.IMenuServices;

@Controller
public class MenuController {
	
	
	@Autowired
	private IMenuServices menuServices;
	
	@RequestMapping(value="/menu")
	public String menu(Model model)
	{
		Menu menu=new Menu();
		model.addAttribute("menu",menu);
		model.addAttribute("titulo", "Actualizando el menu");
		return "menu";
	}
	
	
	@RequestMapping(value="/menu", method = RequestMethod.POST)
	public String guardar(Model model,@Valid Menu menu, BindingResult result)
	{
		
		if (result.hasErrors())
		{
			model.addAttribute("titulo", "te faltaron agregar campos");
			return "menu";
		}
		model.addAttribute("titulo", "Favor de ingresar el menu");
		menuServices.save(menu);
		return "redirect:menu";
	}

}
