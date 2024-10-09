package com.hcl.gl.cart.pojo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
	
	@Autowired
	UsersRepo repo;
	
	public Users getById(int id) {
		Optional<Users> users = repo.findById(id);
		if( users != null ) {
			return users.get();
		}
		else {
			return null;
		}
	}

}
