package com.springcrud.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 

/*
@ComponentScan ({"com.springcrud.crud", "com.springcrud.crud.controllers","com.springcrud.crud.model","com.springcrud.crud.repository"})
@EnableJpaRepositories("com.springcrud.crud.repository")
*/
@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
}
