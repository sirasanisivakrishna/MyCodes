package com.hcl.gl.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.NonFinal;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Wishlist {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	private String category;
	private double price;
	private int usersid;
	public Wishlist(String name, String category, double price,int usersid) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.usersid = usersid;
	}
	

}
