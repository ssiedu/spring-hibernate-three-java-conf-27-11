package com.ssi.entities;

public class Mail {
	private String receiver;
	private String subject;
	private String message;
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Mail [receiver=" + receiver + ", subject=" + subject + ", message=" + message + "]";
	}
	
	
}
