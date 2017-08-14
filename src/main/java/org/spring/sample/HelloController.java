package org.spring.sample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String homepage(){
		return "index";
	}
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld(@RequestParam("name")String name){
		ModelAndView view = new ModelAndView("hello");
		view.addObject("name",name);
		view.addObject("courses",getList());
		view.addObject("dateNow",new Date());
		return view;
	}
	
/*	@RequestMapping("/hello")
	public String helloWorld(HttpServletRequest request, Model model){
		String name = request.getParameter("name");
		model.addAttribute("name", name);
		
		model.addAttribute("courses", getList());
		model.addAttribute("dateNow", new Date());
		return "hello";
	}*/
	
/*	@RequestMapping("/hello")
	public String helloWorld(@RequestAttribute String name, Model model){
		model.addAttribute("name", name);
		return "hello";
	}*/
	
	private List getList(){
		List list = new ArrayList();
		list.add("Spring Framwork");
		list.add("Hibernate");
		list.add("JSP");
		list.add("JAVA");
		list.add("JSON");
		return list;
	}
}
