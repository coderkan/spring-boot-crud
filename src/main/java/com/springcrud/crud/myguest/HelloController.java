package com.springcrud.crud.myguest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@Autowired
	private MyGuestsService service;
	
	@GetMapping("/hello")
	public String sayHello() {
 
		return new String("Hello Erkan");
	}
	
	@GetMapping("/users")
	public List<MyGuests> getAllUsers() {
		List<MyGuests> list = this.service.getAll();
		return list;
	}
}
