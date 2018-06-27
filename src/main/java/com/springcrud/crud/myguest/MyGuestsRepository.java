package com.springcrud.crud.myguest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyGuestsRepository extends JpaRepository<MyGuests, Long>{
	
}
