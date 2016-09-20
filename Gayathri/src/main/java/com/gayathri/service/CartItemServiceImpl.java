package com.gayathri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gayathri.dao.CartItemDao;
import com.gayathri.model.CartItem;

@Service
public class CartItemServiceImpl implements CartItemService {
	@Autowired
    CartItemDao cartItemDao;
	public void addCartItem(CartItem cartItem) {
		cartItemDao.addCartItem(cartItem);
		
	}
	
	public List<CartItem> ViewCartItems(int cartId) {
		
		return cartItemDao.ViewCartItems(cartId);
	}
	
	public void deleteCartItemById(int id) {
		
		cartItemDao.deleteCartItemById(id);
	}

}
