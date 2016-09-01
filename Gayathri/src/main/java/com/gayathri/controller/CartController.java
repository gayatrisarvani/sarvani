package com.gayathri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gayathri.model.Cart;
import com.gayathri.model.CartItem;
import com.gayathri.model.Customer;
import com.gayathri.model.Item;
import com.gayathri.service.CartItemService;
import com.gayathri.service.CustomerService;
import com.gayathri.service.ItemService;

@Controller
public class CartController {
	@Autowired
	CartItemService cartItemService;
	@Autowired
	ItemService itemService;
	@Autowired
	CustomerService customerService;
	@RequestMapping("/addtocart")
	public String addItem(@RequestParam("id")String id)
	{   System.out.println("cart controller="+id);
		String loggedInUserName=SecurityContextHolder.getContext().getAuthentication().getName();
		System.out.println("after loggedinusername="+loggedInUserName);
		Customer customer=customerService.getCustomerByName(loggedInUserName);
		System.out.println("after get customer name="+customer);
		Cart cart=customer.getCart();
		Item item = itemService.getItemById(Integer.parseInt(id));
		CartItem cartItem=new CartItem();
		cartItem.setCart(cart);
		cartItem.setItem(item);
		cartItem.setQuantity(1);
		cartItem.setTotalPrice(item.getPrice());
		cartItemService.addCartItem(cartItem);
		return "redirect:/CustomerCheck";
	}

}
