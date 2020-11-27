package com.ssi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.dao.BookDAO;
import com.ssi.entities.Book;


public interface BookService {
	public Book addNewBook(Book book);
	
	
	
	
}
