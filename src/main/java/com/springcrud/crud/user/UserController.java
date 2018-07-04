package com.springcrud.crud.user;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping(path="/user")
	public @ResponseBody User insertUser(
			@RequestParam("insert") String insert
			) {
		User user = new User();
		user.setFlag(0);
		user.setName(insert);
		user.setSicil("35552");
		long time = System.currentTimeMillis();
		user.setUpdate_date(new java.sql.Date(time));
		user.setDate(new java.sql.Date(time));
		return this.userService.addUser(user);//"inserted id is " + insert;
		
	}
	
	@PostMapping(path="/user")
	public @ResponseBody User updateUsers(
			@RequestParam("update") int id,
			@RequestParam("uname") String uname
			){
		User user = this.userService.updateUser(id, uname);
		return user;
	}
	
	@PostMapping(path="/userdel")
	public @ResponseBody String deleteUser(
			@RequestParam("delete") int id
			){
		this.userService.deleteUser(id);
		return "Deleted Data...";
	}
	
}
