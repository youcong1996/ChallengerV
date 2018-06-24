package com.blog.controller;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.cutomer.utils.MailUtils;

@Controller
public class ViewControllerj {

	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/set")
	public String set() {
		return "set";
	}
	
	@RequestMapping(value="/message")
	public String message() {
		return "message";
	}
	@RequestMapping(value="/home")
	public String home() {
		return "home";
	}
	@RequestMapping(value="/article")
	public String article() {
		return "article";
	}
	@RequestMapping(value="/article_details")
	public String article_details() {
		return "article_details";
	}
	
	@RequestMapping(value="/article_pub")
	public String article_pub() {
		return "article_pub";
	}
	
	@RequestMapping(value="/time_line")
	public String time_line() {
		return "time_line";
	}
	
	@RequestMapping(value="/user_center")
	public String user_center() {
		return "user_center";
	}
	
	@RequestMapping(value="/tips")
	public String tips() {
		return "tips";
	}
	
	@RequestMapping(value="/404")
	public String erroPage() {
		return "404";
	}
	

	
}
