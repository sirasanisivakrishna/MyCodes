package com.hcl.gl.cart.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.apache.catalina.User;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private String category;
	private double price;
	private double totalamount;
	private int quantities;
	@ManyToOne
	@JsonIgnoreProperties("cart")
	private Users users;
	
	
	public Cart(String name, String category, double price, double totalamount, int quantities, Users users) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.totalamount = totalamount;
		this.quantities = quantities;
		this.users = users;
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


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getTotalamount() {
		return totalamount;
	}


	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}


	public int getQuantities() {
		return quantities;
	}


	public void setQuantities(int quantities) {
		this.quantities = quantities;
	}


	public Users getUsers() {
		return users;
	}


	public void setUsers(Users users) {
		this.users = users;
	}


	public Cart(int id, String name, String category, double price, double totalamount, int quantities, Users users) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.totalamount = totalamount;
		this.quantities = quantities;
		this.users = users;
	}


	public Cart() {
		super();
	}
	
//	public Cart(String name, String category, double price, double totalamount,int quantities) {
//		super();
//		this.name = name;
//		this.category = category;
//		this.price = price;
////		this.username = username;
//		this.totalamount = totalamount;
//		this.quantities=quantities;
//	}
//	
//	
	
	
	
	

}
