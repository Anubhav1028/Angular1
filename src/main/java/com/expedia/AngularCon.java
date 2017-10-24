package com.expedia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.MockServer.examples.Test.Book;

@Controller
public class AngularCon {

	
	@RequestMapping(value = "/AjaxUsingAng",produces="application/json",
			method = RequestMethod.POST,consumes="application/json")
	public @ResponseBody 
	List<Book> getAllBookDetails(@RequestBody Book book) {
		//System.out.println(bookId);
		//Book b=new Book(1,"HC Verma","Physics");
	System.out.println(book.getBookId());
	//System.out.println(book.getBookName());
	//book.setBookName("HC Verma Physics");
	book.setBookName("Ierodov for Physics");
	book.setBookDesc("Physics Book");
	List<Book> list=new ArrayList<Book>();
	list.add(book);
	return list;
}
	@RequestMapping(value = "/AjaxUsingAngReq",produces="application/json",
			method = RequestMethod.POST)
	public @ResponseBody 
	List<Book> getSpecBookDetails(@RequestParam(value="bookId") String bookId) {
		System.out.println(bookId);
		Book b=new Book(1,"HC Verma","Physics");
		List<Book> list=new ArrayList<Book>();
		list.add(b);
		return list;
}
	@RequestMapping(value = "/AngularPage", method = RequestMethod.GET)
	public String getAngularPage() {/*
	List<Book> list=new ArrayList<Book>();
	list.add(new Book(1,"HC Verma","Physics"));
	list.add(new Book(2,"Ierodov","Physics"));
	list.add(new Book(3,"Resnick & Heliday","Physics"));*/
	return "angular";
}
	
	@RequestMapping(value = "/Jquery", method = RequestMethod.GET)
	public String getJuqeryPage() {/*
	List<Book> list=new ArrayList<Book>();
	list.add(new Book(1,"HC Verma","Physics"));
	list.add(new Book(2,"Ierodov","Physics"));
	list.add(new Book(3,"Resnick & Heliday","Physics"));*/
	return "jQuery";
}
	@RequestMapping(value = "/jqueryAjax", method = RequestMethod.POST,produces="application/json")
	public @ResponseBody 
 Book JuqeryAjaxEx(@RequestParam(value="bookId") Integer id) {
	System.out.println(id);
	Book b=new Book(id,"HC Verma","Physics");
	return b;
}
}
