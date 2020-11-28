package com.ssi.dao;

import java.util.List;

import org.hibernate.Criteria;
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
		session.saveOrUpdate(book);
		transaction.commit();
		session.close();
		return book;
	}

	public Book getBookByCode(int code) {
		Session session=sessionFactory.openSession();
		Book book=session.get(Book.class, code);
		session.close();
		return book;
	}

	public Book deleteBookByCode(int code) {
		Session session=sessionFactory.openSession();
		Book book=session.get(Book.class, code);
		Transaction transaction=session.beginTransaction();
		session.delete(book);
		transaction.commit();
		session.close();
		return book;
	}

	public List<Book> getAllBooks() {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Book.class);
		List<Book> books=criteria.list();
		session.close();
		return books;
	}
	
	
	
	
}
