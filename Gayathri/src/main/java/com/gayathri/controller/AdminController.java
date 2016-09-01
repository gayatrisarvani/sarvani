package com.gayathri.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.gayathri.model.Customer;
import com.gayathri.model.Item;
import com.gayathri.service.CustomerService;
import com.gayathri.service.ItemService;

@Controller

public class AdminController {
	@Autowired
	ItemService i;
	@Autowired
	CustomerService c;
	
	@RequestMapping("/addItem")
	public ModelAndView addItem()
	{
		Item item= new Item();
		return new ModelAndView("addItem","item",item);
	}
	@RequestMapping("/addProduct")
	public String items(@Valid@ModelAttribute("item")Item item,@RequestParam("file")MultipartFile file,BindingResult bindingResult)throws IllegalStateException,IOException//model attribute captures the values from customerObj
	{
		System.out.println("im in items");
		if(bindingResult.hasErrors())
		{
			System.out.println("description");
			return "redirect:/addItem";
		}
			System.out.println("Item Name:"+item.getItemName());
			System.out.println("Done");
			i.addItem(item);
			MultipartFile itemimage=item.getFile();
			Path path=Paths.get("E://saisirprojectworkspace//Gayathri//src//main//webapp//WEB-INF//resources//images//"+item.getItemId()+".jpg");
			if(itemimage != null && !itemimage.isEmpty()){
				itemimage.transferTo(new File(path.toString()));
				System.out.println("image added");
			}
			System.out.println("Item Added");
			return "redirect:/viewitem";
		
		}
	@RequestMapping("/viewitem")
	public ModelAndView viewItem()throws JsonGenerationException,JsonMappingException,IOException
	{
		List<Item> list=i.viewItem();
		System.out.println("list:"+list);
		ObjectMapper mapper=new ObjectMapper();
		String itemJSON=mapper.writeValueAsString(list);
		System.out.println("JSON data:"+itemJSON);
		return new ModelAndView("viewitem","listofitems",itemJSON);
	}
	
	@RequestMapping("/cust")
	public ModelAndView viewCustomerd() throws JsonGenerationException, JsonMappingException, IOException
	{
	List<Customer>list=c.viewCustomer();
	ObjectMapper mapper= new ObjectMapper();
	String listJson= mapper.writeValueAsString(list);
	System.out.println(listJson);
	System.out.println("List is:"+list);
	return new ModelAndView("cust","listofCustomers",listJson);
	}
	@RequestMapping("/deleteItem")
	public String deleteItem(@RequestParam("id")int id)
	{
		i.deleteItem(id);
		return "redirect:/viewitem";
	}
	@RequestMapping("/editItem")
	public ModelAndView editItem(@RequestParam("id")int id)
	{
		System.out.println("id:"+id);
		Item item=i.getItemById(id);
		System.out.println("Item Name:"+item.getItemName());
		return new ModelAndView("uniqueItem","item",item);
	}
	@RequestMapping("/updatethisitem")
	public String updatethisitem(@RequestParam("itemId")String itemId,@RequestParam("itemName")String itemName,@RequestParam("description")String description,@RequestParam("category")String category,@RequestParam("price")String price)
	{
		int itemId1=Integer.parseInt(itemId);
	    Item item=i.getItemById(itemId1);
	    item.setItemName(itemName);
	    item.setDescription(description);
	    item.setCategory(category);
	    item.setPrice(Float.parseFloat(price));
	    i.updateItem(item);
	    
	    
		return "redirect:/viewitem";
	}
	
	@RequestMapping("/home")
	public ModelAndView homedata()
	{
		return new ModelAndView("home");
	}
	}
	
	
	
	


