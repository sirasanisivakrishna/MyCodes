package com.hcl.gl.cart.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CartService {
	
	@Autowired
	CartRepo repo;
	

	public void insertCartData(Cart cart) {
		repo.save(cart);
	}
	
	public List<Cart> getAll(){
		return	repo.findAll(); 
	}
	
	public void updatecart(Cart cart) {
		repo.save(cart);
	}
	
	public void deletebyid(int id) {
		repo.deleteById(id);
		
	}
	
	public void deleteall() {
		repo.deleteAll();
	}
	
	
}
