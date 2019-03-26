package com.yaske.springweb;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddNotesController {
	
	@RequestMapping(value ="/addNotes")
	public String showForm() {
		return "add-note";
	}
	
	@RequestMapping(value ="/viewNotes")
	public String addNotes(HttpServletRequest request, Model model) {
//		int num = 0;
//		String noted = request.getParameter("noted");
//		num = num + 1;
//		
//		model.addAttribute("Note", noted);
//		model.addAttribute("Number", num);
		
		return "view-note";
	}
	
	@RequestMapping(value ="/noteLists")
	public String noteListed(HttpServletRequest request, Model model) {
		
		String noted = request.getParameter("myNotes");
		
		model.addAttribute("listed", noted);
		
		return "view-note";
	}

}
