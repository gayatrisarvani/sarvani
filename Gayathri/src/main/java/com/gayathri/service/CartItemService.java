package com.gayathri.service;

import java.util.List;

import com.gayathri.model.CartItem;

public interface CartItemService {
	void addCartItem(CartItem cartItem);
	List<CartItem>ViewCartItems(int cartId);
	void deleteCartItemById(int id);
}
