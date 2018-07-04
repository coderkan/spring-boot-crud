package com.springcrud.crud.user;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", unique=true)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="update_date")
	private Date update_date;
	
	@Column(name="sicil")
	private String sicil;
	
	@Column(name="flag")
	private int flag;

	public User() {
		
	}
	
	public User(int id, String name, Date date, Date update_date, String sicil, int flag) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.update_date = update_date;
		this.sicil = sicil;
		this.flag = flag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public String getSicil() {
		return sicil;
	}

	public void setSicil(String sicil) {
		this.sicil = sicil;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	
}
