package com.ssi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.entities.Book;
import com.ssi.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	@Qualifier("bookServiceOld")
	private BookService bookService;
	
	@RequestMapping("deletebook")
	public ModelAndView deleteBookByCode(@RequestParam("bookcode") int code) {
		Book book=bookService.deleteBookByCode(code);
		ModelAndView mv=new ModelAndView("redirect:showall");
		return mv;
	}
	
	@RequestMapping("showall")
	public ModelAndView showAllBooks() {
		List<Book> books=bookService.getAllBooks();
		ModelAndView mv=new ModelAndView("booklist-jstl");
		mv.addObject("books", books);		//anything we store in ModelAndView is internally stored in request object by default)
		return mv;
	}
	
	
	
	@RequestMapping("processsearch")
	public ModelAndView performSearch(@RequestParam("code") int code) {
		Book book=bookService.getBookByCode(code);
		if(book==null) {
			return new ModelAndView("wrongcode");
		}
		ModelAndView mv=new ModelAndView("bookdetails");
		mv.addObject("book", book);
		return mv;
	}
	@RequestMapping("searchbook")
	public String showSearchForm() {
		return "searchform";
	}
	
	@RequestMapping("newbook")
	public String showBookEntryForm() {
		return "dataentry";
	}
	
	@RequestMapping("savebook")
	public ModelAndView saveBookDetails(@ModelAttribute("bookinfo") Book book) {
		bookService.saveBook(book);
		ModelAndView mv=new ModelAndView("saveconfirm");
		return mv;
	}
}
