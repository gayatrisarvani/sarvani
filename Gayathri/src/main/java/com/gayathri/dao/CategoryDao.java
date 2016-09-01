package com.gayathri.dao;

import java.util.List;

import com.gayathri.model.Item;

public interface CategoryDao {
	List<Item> addDiamond();
	List<Item> getItemByCategory( String category);

}
