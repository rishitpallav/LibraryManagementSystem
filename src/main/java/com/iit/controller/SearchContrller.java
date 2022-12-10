package com.iit.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchContrller {
	
	@PostMapping("/searchResults")
	public ModelAndView search(@Param("document_title") String document_title,@Param("author_name") String author_name,@Param("document_type") String document_type) {
		System.out.println(document_title+" "+author_name+" "+document_type);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("searchResults");
		return mv;
	}
}
