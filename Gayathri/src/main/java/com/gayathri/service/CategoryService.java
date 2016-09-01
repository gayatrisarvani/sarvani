package com.gayathri.service;

import java.util.List;

import com.gayathri.model.Item;

public interface CategoryService {
	List<Item> addDiamond();
	List<Item> getItemByCategory(String category);

}
