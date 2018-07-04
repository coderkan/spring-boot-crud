package com.springcrud.crud.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User addUser(User user) {
		return this.userRepository.save(user);
	}
	
	public User updateUser(int id, String uname) {
		User user = null;
		Optional<User> userOptional = this.userRepository.findById(id);
		if (userOptional.isPresent()){
			user = userOptional.get();
			user.setName(uname);
			long time = System.currentTimeMillis();
			user.setUpdate_date(new java.sql.Date(time));
			user = this.userRepository.save(user);
		}
		else{
		   // alternative processing....
		}
		return user;
	}
	
	public void deleteUser(int id) {
		this.userRepository.deleteById(id);		
	}
	
}
