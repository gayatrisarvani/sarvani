package com.gayathri.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
public class CartItem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id@GeneratedValue
	private int cartItemId;
	private int quantity;
	@OneToOne
    @JoinColumn(name="itemId")
	private Item item;
	private double totalPrice;
	@ManyToOne
	@JoinColumn(name="cartId")
	@JsonIgnore
	private Cart cart;
	private int image_id;
	public int getImage_id() {
		return image_id;
	}
	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}
	public int getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
