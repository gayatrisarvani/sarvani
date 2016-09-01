package com.gayathri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gayathri.dao.ItemDao;
import com.gayathri.model.Item;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemDao itemDao;
	public void addItem(Item item) {
		System.out.println("ItemService");
	itemDao.addItem(item);
	}
	public List<Item> viewItem() {
		
		List<Item>list=itemDao.viewItem();
		return list;
	}
	
	
	public void deleteItem(int id) {
		itemDao.deleteItem(id);
		
		
	}
	
	public Item getItemById(int id) {
		
		return itemDao.getItemById(id);
	}
	
	public void updateItem(Item item) {
	 itemDao.updateItem(item); 
		
	}
	
	

}
