package com.example.springboot.dao;

import java.util.Optional;

import org.apache.catalina.User;

public interface Dao<T> {

	Optional<User> get(long id);

}
