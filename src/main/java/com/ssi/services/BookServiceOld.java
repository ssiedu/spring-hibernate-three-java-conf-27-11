package com.ssi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.dao.BookDAO;
import com.ssi.entities.Book;

@Service
public class BookServiceOld implements BookService{
	@Autowired
	private BookDAO bookDAO;
	
	public Book addNewBook(Book book) {
		System.out.println("Using Old Book Service......");
		//its a new implementation to save the book
		bookDAO.saveBook(book);
		return book;
	}
	
	
}
