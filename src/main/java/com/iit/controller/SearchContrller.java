package com.iit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iit.dto.BookDto;
import com.iit.dto.journalIssueDto;
import com.iit.model.Book;
import com.iit.model.Journal;
import com.iit.model.JournalIssue;
import com.iit.respository.LibrarianRepository;
import com.iit.respository.SearchRepository;

@Controller
public class SearchContrller {
	
	@Autowired
	SearchRepository searchRepository;
	
	BookDto bookDto;
	
	List<Book> currentBook;
	List<journalIssueDto> currentJournal;
	
	@PostMapping("/searchResults")
	public ModelAndView search(@Param("document_title") String document_title,@Param("author_name") String author_name,@Param("document_type") String document_type) {
		System.out.println(document_title+" "+author_name+" "+document_type);
		if (currentBook!=null)
			currentBook.clear();
		if(document_type.equals("book") || document_type.equals("all")) {
		currentBook=searchRepository.SearchBookByAuthor(author_name);
		if( document_title!="")
		currentBook.addAll(searchRepository.SearchBookByTitle(document_title));
		}
		
//		System.out.println(currentJournal.get(0));
		ModelAndView mv = new ModelAndView();
		mv.addObject("searchList", currentBook);
		mv.setViewName("searchResults");
		
		return mv;
	}
}
