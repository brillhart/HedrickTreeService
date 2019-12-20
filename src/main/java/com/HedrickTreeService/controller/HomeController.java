package com.HedrickTreeService.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.HedrickTreeService.model.RequestInfo;

@Controller
public class HomeController {

	
	@RequestMapping(path="/", method = RequestMethod.GET)
	public String showHomepage(Model model) {
		if(! model.containsAttribute("requestinfo")) {
			model.addAttribute("requestinfo", new RequestInfo());
		}
		return "home";
	}
	
	@RequestMapping(path="/", method = RequestMethod.POST)
	public String showRequestInfoSubmission(@Valid @ModelAttribute("requestinfo") RequestInfo formValues,
		BindingResult result, RedirectAttributes flash) {
		if(result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "requestinfo", result);
			flash.addFlashAttribute("requestinfo", formValues);
			return "redirect:/";
		}
		flash.addFlashAttribute("requestInfoMessage", "Thank you for contacting us! We will get back to you shortly!");	
		return "redirect:/requestinfo";
	}


	@RequestMapping(path="requestinfo")
	public String infoConfirmationPage() {
		return "requestinfo";
	}
	
	@RequestMapping(path="about")
	public String showAboutPage() {
		return "about";
	}
	
	@RequestMapping(path="services")
	public String showServicesPage() {
		return "services";
	}
	
	@RequestMapping(path="contact")
	public String showContactPage() {
		return "contact";
	}
}
