package org.spring.sample;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {
	
	
	@RequestMapping("/formPerson")
	public ModelAndView formPerson(){
		ModelAndView view = new ModelAndView("formPerson", "info", new Information());
		setFormData(view);
		return view;
	}
	
	@RequestMapping("/detailPerson")
	public ModelAndView detailPerson(Information information){
		ModelAndView view = new ModelAndView("detailPerson", "info", new Information());
		view.addObject("firstName", information.getFirstName());
		view.addObject("lastName", information.getLastName());
		view.addObject("gender", information.getGender());
		view.addObject("country", information.getCountry());
		view.addObject("message", information.getMessage());
		view.addObject("visitedCountry", information.getVisitedCountry());
		return view;
	}
	
	public static void setFormData(ModelAndView view){
		Map mapGender = new HashMap();
		mapGender.put("Male", "Male");
		mapGender.put("Female", "Female");
		view.addObject("genders", mapGender);
		
		Map mapCountry = new HashMap();
		mapCountry.put("India","India");
		mapCountry.put("Japan","Japan");
		mapCountry.put("USA","USA");
		mapCountry.put("Thailand","Thailand");
		view.addObject("countrys", mapCountry);
		
		Map mapVisitedCountry = new HashMap();
		mapVisitedCountry.put("Thailand", "Thailand");
		mapVisitedCountry.put("China", "China");
		mapVisitedCountry.put("Sweden", "Sweden");
		mapVisitedCountry.put("Japan", "Japan");
		
		view.addObject("visitedCountrys", mapVisitedCountry);
	}
}
