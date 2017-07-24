package com.niit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
import com.niit.dao.SupplierDAO;
import com.niit.dao.UserDAO;
import com.niit.domain.Category;
import com.niit.domain.Product;
import com.niit.domain.Supplier;
import com.niit.domain.User;


@Controller
public class UserController {
	
	
	private static Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserDAO userDAO;
	@Autowired User user;
	
	
	@Autowired
	Category category;
	@Autowired
	CategoryDAO categoryDAO;

	@Autowired
	Product product;
	@Autowired
	ProductDAO productDAO;

	@Autowired
	SupplierDAO supplierDAO;
	@Autowired
	Supplier supplier;
	//get the user id password from the login page
	//send these values to userDAO.validate
	//based on response , you can navigate to either login.jsp or home.jsp

	
	@RequestMapping("/validate")
	public ModelAndView login(@RequestParam("id") String id,@RequestParam("password") String password)
{
	
	ModelAndView mv = new ModelAndView("/Home");
	if(userDAO.validate(id, password)==true)
	{
		user = userDAO.get(id);
		//&{message} - to display in the home.
		mv.addObject("message","WELCOME  "+user.getName());
		
		if (user.getRole().equals("admin")) {
			log.debug("You are admin");
			mv.addObject("isAdmin", "true");
		} else {
			log.debug("You are a customer");
			mv.addObject("isAdmin", "false");
		}
	}
	else
	{
		mv.addObject("message", "INvalid credentials....please try again");
	}
	
	return mv;
	
}

	@RequestMapping("/Register")
	public ModelAndView register(@RequestParam("uId") String id, @RequestParam("uPassword") String password, @RequestParam("uName") String name, @RequestParam("uContact") String contact) {

		ModelAndView mv = new ModelAndView("/Home");
		log.debug("Starting of the method register");
		log.debug("Assigning values");
		
		user.setId(id);
		user.setName(name);
		user.setPassword(password);
		user.setContact(contact);
		user.setRole("ROLE_USER");
		
		
		log.info("You are signing up with username : "+id);
		
		if (userDAO.save(user) == true) {
			log.debug("saving credentials");
			user = userDAO.get(id);
			mv.addObject("message", "Welcome " + user.getName() + "! Please Login to Continue");

			mv.addObject("categoryList", categoryDAO.list());
			mv.addObject("category", categoryDAO);

			mv.addObject("supplierList", supplierDAO.list());
			mv.addObject("supplier", supplierDAO);
			

			
		} else {
			log.debug("Error");
			mv.addObject("message", "invalid credentials");
		}
		log.debug("Ending of the method login");
		return mv;

	}

}
	

