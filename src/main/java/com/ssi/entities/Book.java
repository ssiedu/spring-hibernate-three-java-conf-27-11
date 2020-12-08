package com.ssi.entities;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Book {
	@Id
	@Min(value=1001, message="code cant be less than 1001")
	private int code;
	@Size(max=15, message="title size cant exceed 15 chars")
	private String title;
	private String subject;
	@Size(min=3, max=20, message="author name must be between 3-20 chars long")
	@Pattern(regexp="[a-zA-Z]*", message="only alphabates are allowed for author name") 
	private String author;
	@Min(value=100, message="lowest book price is 100")
	@Max(value=1000, message="higest book price is 10000")
	//@Range(min=100, max=10000, message="price range must be between 100-10000")
	private int price;
	private Blob picture;
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	public Blob getPicture() {
		return picture;
	}
	public void setPicture(Blob picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "Book [code=" + code + ", title=" + title + ", subject=" + subject + ", author=" + author + ", price="
				+ price + ", picture=" + picture + "]";
	}
	
	
	
}
