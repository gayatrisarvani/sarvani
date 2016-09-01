package com.gayathri.dao;

import java.util.List;


import com.gayathri.model.Item;

public interface ItemDao {
	void addItem(Item item);
	public List<Item> viewItem();
	void deleteItem(int id);
	Item getItemById(int id);
	void updateItem(Item item);
	
}