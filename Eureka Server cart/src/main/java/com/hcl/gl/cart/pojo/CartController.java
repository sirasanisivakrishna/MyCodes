package com.hcl.gl.cart.pojo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@Autowired
	UsersService usersService;
	

	 @GetMapping("/addtocart")  // 
		@ResponseBody
		 //insert data into cart
		public String addProduct(String name,String category,double price,int usersid,double totalamount,int quantities) {
			Users users = usersService.getById(usersid);
			//System.out.println(users.getEmial());
				Cart cart1=new Cart(name, category,price,totalamount,quantities,users);
				cartService.insertCartData(cart1);
			return "Product added Successuly";	
		}
	 
	 @GetMapping("/getcart")
	 //get data from cart
	 public String getall() throws JsonProcessingException{
			List<Cart> carts= cartService.getAll();
			ObjectMapper objectMapper=new ObjectMapper();
			String message=objectMapper.writeValueAsString(carts);
			return message;
			
	 }
	 
		/*
		 * @GetMapping("/updatecart") // //insert data into cart public String
		 * updatecart(int id,String name,String category,double price,int usersid,double
		 * totalamount,int quantities) { Users users = usersService.getById(usersid);
		 * Cart cart1=new Cart(id,name, category,price,totalamount,quantities,users);
		 * cartService.insertCartData(cart1); return "Product updated Successuly"; }
		 */
	 
	 
	 	@GetMapping("/deleteall")
	 	public String deleteall() {
			 cartService.deleteall();
			 return "deleted successfully";
	 		
	 	}
	 	
	 	

		@GetMapping("/deletebyid")
		public String deleteproduct(int id) {
			cartService.deletebyid(id);
				return "deletion Sucessful"; 			
				
		}	

}
