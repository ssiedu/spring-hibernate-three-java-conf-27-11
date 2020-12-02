package com.ssi.controllers;

import java.util.ArrayList;
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
	
	@RequestMapping("springform")
	public ModelAndView showSampleSpringForm() {
		ModelAndView mv=new ModelAndView("sample-spring-form");
		Book book=new Book(); book.setCode(555); book.setSubject("xyz"); book.setTitle("pqr"); book.setAuthor("mno"); book.setPrice(300);
		List<String> subjects=new ArrayList<String>();
		subjects.add("java"); subjects.add("python"); subjects.add("sql"); subjects.add("linux"); subjects.add("solaries"); subjects.add("aws");
		
		mv.addObject("book", book);
		mv.addObject("subjects",subjects);
		return mv;
	}
	
	
	@RequestMapping("savechanges")
	public ModelAndView saveChanges(@ModelAttribute("book") Book book) {
		bookService.saveBook(book);
		ModelAndView mv=new ModelAndView("redirect:showall");
		return mv;
	}
	
	@RequestMapping("change")
	public ModelAndView showUpdateForm(@RequestParam("bookcode") int code) {
		Book book=bookService.getBookByCode(code);
		ModelAndView mv=new ModelAndView("update-form");
		mv.addObject("book",book);
		return mv;
	}
	
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
