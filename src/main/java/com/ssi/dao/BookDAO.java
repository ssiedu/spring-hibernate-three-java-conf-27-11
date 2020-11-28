package com.ssi.dao;

import java.util.List;

import com.ssi.entities.Book;

public interface BookDAO {
	public Book saveBook(Book book);
	public Book getBookByCode(int code);
	public Book deleteBookByCode(int code);
	public List<Book> getAllBooks();

}
