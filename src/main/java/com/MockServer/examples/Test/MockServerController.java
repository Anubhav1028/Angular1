package com.MockServer.examples.Test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MockServerController {

	public MockServerController() {
		super();
		System.out.println("created");
		// TODO Auto-generated constructor stub
	}

	/*@RequestMapping(value = "/getBookDetails",produces="application/json", method = RequestMethod.GET
			)
	public @ResponseBody 
	Book getBookDetails(@RequestParam(value = "bookId") Integer bookId) {
		Book b = new Book();
		b.setBookId(bookId);
		b.setBookName("mockserver");
		b.setBookDesc("service virtualization");
		return b;
	}*/
	
	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public String check() {
		return "mockServer";
	} 
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginvheck(@ModelAttribute UserAuth u) {
		System.out.println(u.getPassword());
		return "result";
	} 
}
