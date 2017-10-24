package com.expedia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.MockServer.examples.Test.Book;
import com.MockServer.examples.Test.UserAuth;

@Controller
public class Expedia {

	public Expedia() {
		super();
		//System.out.println("created");
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "/getAllBookDetails",produces="application/json", method = RequestMethod.GET)
		public @ResponseBody 
		List<Book> getAllBookDetails() {
		List<Book> list=new ArrayList<Book>();
		list.add(new Book(1,"HC Verma","Physics"));
		list.add(new Book(2,"Ierodov","Physics"));
		list.add(new Book(3,"Resnick & Heliday","Physics"));
		return list;
	}
	@RequestMapping(value = "/getBookDetails",produces="application/json", method = RequestMethod.GET)
	public @ResponseBody
	Book getBookDetails (@RequestParam(value = "bookId") int bookId) {
	Book b = new Book();
	b.setBookId(bookId);
	b.setBookName("Ierodov");
	b.setBookDesc("Physics");
	return b;
	
}
	
	/*@RequestMapping(value = "/check", method = RequestMethod.GET)
	public String check() {
		return "mockServer";
	} 
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginvheck(@ModelAttribute UserAuth u) {
		System.out.println(u.getPassword());
		return "result";
	} */
}
