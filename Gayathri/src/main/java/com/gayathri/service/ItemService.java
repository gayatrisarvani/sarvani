package com.gayathri.service;

import java.util.List;

import com.gayathri.model.Item;



public interface ItemService {
	void addItem(Item item);
	public List<Item> viewItem();
	void deleteItem(int id);
	Item getItemById(int id);
	void updateItem(Item item);


}