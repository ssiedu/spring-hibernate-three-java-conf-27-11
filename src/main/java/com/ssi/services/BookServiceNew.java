package com.ssi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.dao.BookDAO;
import com.ssi.entities.Book;

@Service
public class BookServiceNew implements BookService{
	@Autowired
	private BookDAO bookDAO;
	
	public Book addNewBook(Book book) {
		//its a new implementation to save the book
		System.out.println("Using New Book Service....");
		bookDAO.saveBook(book);
		return book;
	}
	
	
}
