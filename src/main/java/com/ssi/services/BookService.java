package com.ssi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.dao.BookDAO;
import com.ssi.entities.Book;


public interface BookService {
	public Book saveBook(Book book);
	public Book deleteBookByCode(int code);
	public List<Book> getAllBooks();

	public Book getBookByCode(int code);
	
	
}
