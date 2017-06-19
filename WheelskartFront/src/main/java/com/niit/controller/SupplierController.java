package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.SupplierDAO;
import com.niit.domain.Supplier;

@Controller
public class SupplierController {
	
	private static  Logger log = LoggerFactory.getLogger(SupplierController.class);
	//create supplier
	//fetch all categories
	//delete supplier
	//update supplier
	
	@Autowired  SupplierDAO supplierdAO;
	
	@Autowired  Supplier supplier;
	
	@Autowired  HttpSession session;
	
	
	//@RequestMapping("/manage_supplier_add")
	@GetMapping("/manage_supplier_add")
	public ModelAndView  createSupplier(@RequestParam("id") String id, 
			@RequestParam("name") String name,  @RequestParam("address") String desc)
   {
		log.debug("Starting of the method manageCategories");
		supplier.setId(id);
		supplier.setName(name);
		supplier.setAddress(desc);
		
		ModelAndView mv = new ModelAndView("Home");
		
		mv.addObject("isAdminClickedCategories", "true");
		mv.addObject("isAdmin", "true");
		
		//Before calling save method, check whether the supplier id already exist in db or not
		
		//if it is does not exist, then only call save method
		
		if (supplierdAO.getSupplierByID(id) !=null)
		{
			//supplier already exist
			mv.addObject("message", "Supplier already exist with teh id " +id);
			return mv;
			
		}
		else  // actualy else is not required if return statement is there in if condition
		{
			supplierdAO.save(supplier);
			mv.addObject("message", "Supplier created successfuly ");
		}
		
		session.setAttribute("supplierList", supplierdAO.list());
		session.setAttribute("supplier", supplier);

		log.debug("End of the method manageCategories");
		return mv;
		
		
		
	}
	@RequestMapping("/manage_supplier_delete/{id}")
	public ModelAndView deleteSupplier(@PathVariable("id") String id)
	{
		
		log.debug("Starting of the method deleteSupplier");
		log.debug("You are going to delete " + id);
		ModelAndView mv = new ModelAndView("Home");
		 if( supplierdAO.delete(id))
		 {
			 mv.addObject("message", "successfully deleted the supplier");
		 }
		 else
		 {
			 mv.addObject("message", "Not able to delte the supplier");
		 }
		 
			session.setAttribute("supplierList", supplierdAO.list());
			session.setAttribute("supplier", supplier);
			
		
			log.debug("Ending of the method deleteSupplier");
		 
		 return mv;
		 
		 
	}
	
	
}
