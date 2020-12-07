package com.ssi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.entities.Mail;

@Controller
public class MailingController {
	
	@Autowired
	private MailSender mailSender;
	
	
	@RequestMapping("mail")
	public String showMailForm() {
		return "mailform";
	}
	
	@RequestMapping("sendmail")
	public ModelAndView sendMail(@ModelAttribute("mail") Mail mail) {
		System.out.println(mail);
		SimpleMailMessage simpleMessage=new SimpleMailMessage();
		simpleMessage.setTo(mail.getReceiver());
		simpleMessage.setSubject(mail.getSubject());
		simpleMessage.setText(mail.getMessage());
		mailSender.send(simpleMessage);
		ModelAndView mv=new ModelAndView("mailing-confirmation");
		return mv;
	}
}
