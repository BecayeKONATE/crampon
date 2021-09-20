package com.saraya.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.model.Crampon;
import com.saraya.service.CramponService;
import com.saraya.service.UserValidation;

@Controller
public class CramponController {

	@Autowired
	CramponService cs;
	@Autowired
	UserValidation uv;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginCrampon() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String homeCrampon(ModelMap model, @RequestParam String username,
			@RequestParam String pswrd) {
		model.addAttribute("user", username);
		boolean valid = uv.isValid(username, pswrd);
		if(valid) {
			return "home";
		}else {
			model.addAttribute("errorMessage", "Wrong credential");
			return "redirect:/login";	
		}
	}
	
	@RequestMapping(value="/list-crampon", method=RequestMethod.GET)
	public String cramponList(ModelMap model) {
		model.addAttribute("cramps", cs.getAllCrampon());
		return "cramponList";
	}
	
	@RequestMapping(value="/add-crampon", method=RequestMethod.GET)
	public String addCrampon(ModelMap model) {
		model.addAttribute("crampon", new Crampon());
		return "addCrampon";
	}
	@RequestMapping(value="/add-crampon", method=RequestMethod.POST)
	public String addCrampo(ModelMap model, @Valid Crampon cramp, BindingResult result) {
		if(result.hasErrors())
			return "addCrampon";
		cs.addCrampon(cramp.getMake(), cramp.getImage());
		model.clear();
		return "redirect:/list-crampon";
	}
	
	@RequestMapping(value="/delete-crampon", method=RequestMethod.GET)
	public String deleteCrampon(ModelMap model, @RequestParam int id) {
		cs.deleteCrampon(id);
		model.clear();
		return "redirect:/list-crampon";
	}
	
	@RequestMapping(value="/image-crampon", method=RequestMethod.GET)
	public String seeCrampon(@RequestParam int id) {
		cs.seeCrampon(id);
		return "seeCrampon";
	}
	
	@RequestMapping(value="/update-crampon", method=RequestMethod.GET)
	public String updateCrampon(@RequestParam int id, ModelMap model) {
		model.addAttribute("crampon", cs.seeCrampon(id));
		return "addCrampon";
	}
	
	@RequestMapping(value="/update-crampon", method=RequestMethod.POST)
	public String updatedCrampon(ModelMap model, @Valid Crampon cramp,
			BindingResult result) {
		if(result.hasErrors())
			return "addCrampon";
		cs.update(cramp);
		model.clear();
		return "redirect:/list-crampon";
	}
}







