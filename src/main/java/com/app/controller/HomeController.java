package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {
	/*@RequestMapping("/show")
	public ModelAndView showpage() {
		ModelAndView m=new ModelAndView();
		m.setViewName("Home");
		m.addObject("eid", 123);
		Employee e=new Employee(10,"AA",3.6);
		m.addObject("emp",e);
		List<Employee> ll=Arrays.asList(new Employee(55,"yy",1.1),
				new Employee(55,"ss",1.3),
				new Employee(55,"tt",1.34));
		m.addObject("empsList",ll);
		return m;
	}	*/
	
/*	@RequestMapping(value="/show",method=RequestMethod.GET)
	public String showData(Model model) {
		System.out.println("data");
		model.addAttribute("sid", 1233);
		return "Home";
		
	}*/
	
	@RequestMapping("/showA")
	public String showpage() {
		ModelAndView m=new ModelAndView();
		return "Home";
		
	}

	@RequestMapping("/showB")
	public String showpageA(ModelMap  map) {
		map.addAttribute("eid",34);
		map.addAttribute("ename","AA");
		return "Data";
	
}
}