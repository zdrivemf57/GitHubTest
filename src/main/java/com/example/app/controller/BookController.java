package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.app.domain.Book;

@Controller
public class BookController {

	@GetMapping
	public String show(Model model) {
		Book book = new Book();
		book.setName("ABC");
		book.setAuthor("abc");
		book.setPrice(1000);
		model.addAttribute("book",book);
		return "show";
	}
}
