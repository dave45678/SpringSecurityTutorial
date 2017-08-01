package com.pfsoftware.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pfsoftware.demo.model.User;

public interface UserRepository extends CrudRepository<User,Long> {
	User findByUsername(String username);
}
