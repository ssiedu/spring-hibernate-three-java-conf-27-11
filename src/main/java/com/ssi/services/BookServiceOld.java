package com.ssi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.dao.BookDAO;
import com.ssi.entities.Book;

@Service
public class BookServiceOld implements BookService{
	@Autowired
	private BookDAO bookDAO;
	
	public Book saveBook(Book book) {
		System.out.println("Using Old Book Service......");
		//its a new implementation to save the book
		bookDAO.saveBook(book);
		return book;
	}

	public Book deleteBookByCode(int code) {
		// TODO Auto-generated method stub
		return bookDAO.deleteBookByCode(code);
	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDAO.getAllBooks();
	}
	public Book getBookByCode(int code) {
		// TODO Auto-generated method stub
		return bookDAO.getBookByCode(code);
	}
	
}
