package com.gayathri.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
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
import org.springframework.web.servlet.ModelAndView;

import com.gayathri.model.Customer;
import com.gayathri.model.Item;
import com.gayathri.service.CategoryService;
import com.gayathri.service.CustomerService;
import com.gayathri.service.ItemService;

@Controller
public class HomeController {
	//This is the first request mapping
	
	@Autowired
	CategoryService catservice;
	
	@Autowired
	ItemService i;
	@Autowired
	CustomerService service;
	@RequestMapping("/")
	public ModelAndView homepage()
	{
		System.out.println("home method called");
		return new ModelAndView("home");
	}
	//This SignUp and a href SignIn name in SignUp.jsp file should match
	/*@RequestMapping("/SignUp")
	public ModelAndView SignUppage()
	{
		Customer customer= new Customer();
		System.out.println("SignUp method called");
		return new ModelAndView("SignUp","customerObj",customer);//this SignUp and views SignUp.jsp file name should match.customerObj is a key value which goes to the controller and it takes or gets all the values of customer and then goes to views 
	}*/
	@RequestMapping("/login")
	public String loginMethod()
	{
		return "login";
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request)
	{
		request.getSession().invalidate();
		System.out.println("logout page called");

		return "logout";
		
	}
	@RequestMapping("/CustomerCheck")
	public ModelAndView CustomerCheck(Principal principal) throws JsonGenerationException, JsonMappingException, IOException
	{
		List<Item> list=i.viewItem();
		System.out.println("list:"+list);
		ObjectMapper mapper=new ObjectMapper();
		String itemJSON=mapper.writeValueAsString(list);
		System.out.println("JSON data:"+itemJSON);
		return new ModelAndView("customerHome","listofitems",itemJSON);
		
	}
	@RequestMapping("/viewSelectedItem")
	public ModelAndView viewselectedItem(@RequestParam("id")String id)
	{
		System.out.println("view the slected items");
		Item item=i.getItemById(Integer.parseInt(id));
		return new ModelAndView("viewSelectedItem","item",item);
		
	}
	@RequestMapping("/AdminCheck")
	public ModelAndView AdminCheck(Principal principal)
	{
		System.out.println("UserName:"+principal.getName());
		return new ModelAndView("adminHome");
	}
	/*@RequestMapping("/register")//action name given SignUp.jsp and request mapping must be same
	public String register(@Valid@ModelAttribute("customerObj")Customer customer,BindingResult bindingResult)//model attribute captures the values from customerObj
	{
		System.out.println("I am in register page");
		if(bindingResult.hasErrors())
		{
			System.out.println("has errors");
			System.out.println("BindingResult");
			return "redirect:/SignUp";
		}
	System.out.println("UserName:"+customer.getUsername());
	System.out.println("Password:"+customer.getPassword());
	System.out.println("done saving");
	service.addCustomer(customer);
	return "redirect:/login";
	
    }*/
	@RequestMapping("/about")
	public ModelAndView Aboutuspage()
	{
		System.out.println("About method called");
		return new ModelAndView("about");
	}
	@RequestMapping("/contact")
	public ModelAndView contactuspage()
	{
		System.out.println("About method called");
		return new ModelAndView("contact");
	}
	@RequestMapping("/Diamond")
	public ModelAndView samsungdata(@RequestParam("category") String category) throws JsonGenerationException, JsonMappingException, IOException
	{
		System.out.println(category);
		List<Item> listCategory=catservice.getItemByCategory(category);
		ObjectMapper mapper= new ObjectMapper();
		String itemJSON=mapper.writeValueAsString(listCategory);
	System.out.println("JSON data:"+itemJSON);
		return new ModelAndView("diamond","da",itemJSON);
	}
	
}

