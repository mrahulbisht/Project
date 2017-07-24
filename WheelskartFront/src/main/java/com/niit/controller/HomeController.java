
package com.niit.controller;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
import com.niit.dao.SupplierDAO;
import com.niit.domain.Category;
import com.niit.domain.Product;
import com.niit.domain.Supplier;



@Controller
public class HomeController {
	
	@Autowired
	HttpSession session;

	@Autowired
	Category category;

	@Autowired
	CategoryDAO categoryDAO;

	@Autowired
	Product product;

	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	Supplier supplier;
	
	@Autowired
	SupplierDAO supplierDAO;


	
	//http://localhost:8080/wheelsportal/

	/*@RequestMapping("/")
	public  String goToHome(Model model)
		{
		System.out.println("In goToHOme method");
		model.addAttribute("message", "Thank you for visiting Shopping Cart");
		return "Home";
		
	}      */

	@RequestMapping("/")
	public  ModelAndView goToHome()
		{
		
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("message", "Thank you for visiting Wheelskart");
		mv.addObject("isUserAtHomePage", "true");
		// model.addAttribute("message", "Thank you for visiting Shopping Cart!
		// <br>");

		// get all categories
		List<Category> categoryList = categoryDAO.list();

		// attach category to session
		session.setAttribute("categoryList", categoryList);
		session.setAttribute("category", category);

		// get products
		List<Product> productList = productDAO.list();

		// attach products to session
		session.setAttribute("productList", productList);
		session.setAttribute("product", product);
		
		// get products
		List<Supplier> supplierList = supplierDAO.list();
		
		// attach supplier to session
		session.setAttribute("supplierList", supplierList);
		session.setAttribute("supplier", supplier);

		return mv;
		// return "Home";
	
	
	}   
	
	
	@RequestMapping("/LoginPage")
	public String loginPage(Model model)
	{
		
		model.addAttribute("isUserClickedLogin", "true");
		return "Login";
	}
	
	@RequestMapping("/RegistrationPage")
	public String registrationPage(Model model)
	{
		
		model.addAttribute("isUserClickedRegister", "true");
		
		return "Registration";
	}

	@RequestMapping("/Contact")
	public String contactUs(Model model) {
	
		return "Contact";
	}
	@RequestMapping("/About")
	public String about(Model model) {
		model.addAttribute("isUserClickedAbout", "true");
	
		return "About";
	}		
	@RequestMapping("/Works")
	public String workPage(Model model) {
		model.addAttribute("isUserClickedWorks", "true");
		return "Works";
	}
	@RequestMapping("/News")
	public String newsPage(Model model) {
		model.addAttribute("isUserClickedNews", "true");
	
		return "News";
	}
	@RequestMapping("/Services")
	public String servicesPage(Model model) {
		model.addAttribute("isUserClickedServices", "true");
		return "Services";
	}
}