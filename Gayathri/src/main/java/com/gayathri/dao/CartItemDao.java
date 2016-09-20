package com.gayathri.dao;

import java.util.List;

import com.gayathri.model.CartItem;

public interface CartItemDao {
	void addCartItem(CartItem cartItem);
List<CartItem>ViewCartItems(int cartId);
void deleteCartItemById(int id);
}
