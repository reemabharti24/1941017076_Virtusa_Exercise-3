package com.example.springboot.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;

public class UserDao implements Dao<User> {

	private List<User> users = new ArrayList<>();

	public UserDao() {
users.add(new User("John", "john@domain.com"));
users.add(new User("Susan", "susan@domain.com"));
}
	@Override
	
public Optional<User> get(long id) {
return Optional.ofNullable(users.get((int) id));
    }
	public List<User> getAll() 
	{
		
		return users;
	}
         
    @Override


