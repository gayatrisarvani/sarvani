package com.gayathri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gayathri.dao.CategoryDao;
import com.gayathri.model.Item;

@Service
public class CategoryServiceImpl  implements CategoryService{
	@Autowired
	CategoryDao categoryDao;
	
	public List<Item> getItemByCategory(String category) {
		
		return categoryDao.getItemByCategory(category);
	}
	
	public List<Item> addDiamond() {
		
		return null;
	}
}
