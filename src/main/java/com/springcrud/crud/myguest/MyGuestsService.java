package com.springcrud.crud.myguest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyGuestsService {
	
	@Autowired
	private MyGuestsRepository repository;
	
	public List<MyGuests> getAll(){
		return this.repository.findAll();
	}
	
}
