package com.gayathri.service;

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

}
