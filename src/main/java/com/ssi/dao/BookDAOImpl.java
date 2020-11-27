package com.ssi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssi.entities.Book;

@Repository
public class BookDAOImpl implements BookDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	//to save book
	public Book saveBook(Book book) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(book);
		transaction.commit();
		session.close();
		return book;
	}
	
	//to update book
	
	//to delete book
	
	//to search book 
	
	//etc.
	
	
}
