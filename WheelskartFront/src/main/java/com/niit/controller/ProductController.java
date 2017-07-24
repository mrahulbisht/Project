package com.niit.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
import com.niit.dao.SupplierDAO;
import com.niit.domain.Category;
import com.niit.domain.Product;
import com.niit.domain.Supplier;
import com.niit.util.FileUtil;
import com.niit.util.Util;


@Controller
public class ProductController {

	private static Logger log = LoggerFactory.getLogger(ProductController.class);

	@Autowired(required = true)
	private ProductDAO productDAO;

	@Autowired(required = true)
	private CategoryDAO categoryDAO;
	
	@Autowired(required = true)
	private Product product;

	@Autowired(required = true)
	private SupplierDAO supplierDAO;

	//Actually we have to keep this path in a property file
	//private String path = "D:\\ShoppingCart\\Images";
	
	//private String path = "resources/img/";
  private String path   ="D://Workspace//NIITWS//ShoppingCartWS//ShopingCartFrontEnd//src//main//webapp//resources//img";
	
	// get the path where you downloaded tomcat
  //D:\Softwares\Server\apache-tomcat-9.0.0.M6
  //private  String path =System.getProperty("catalina.home");
    
	
	@RequestMapping("/search_product/{search_string}")
	public ModelAndView getAllProductBySearchString(@PathVariable("search_string")
		String search_string)
	{
	  List<Product> products=	 productDAO.getSimilarProducts(search_string);
	  ModelAndView mv= new ModelAndView("/home");
	  
	  if(products.isEmpty())
	  {
		  mv.addObject("msg", "No products are available with the search text :" +search_string );
	  }
	  else
	  {
		  mv.addObject("productList", products);
	  }
  
	  return mv;
	
	}
 	@RequestMapping(value = "/manageProducts", method = RequestMethod.GET)
	public String listProducts(Model model) {
		log.debug("Starting of the method listProducts");
		model.addAttribute("product", new Product());
		/*model.addAttribute("category", new Category());
		model.addAttribute("supplier", new Supplier());*/
		model.addAttribute("productList", this.productDAO.list());
		/*model.addAttribute("categoryList", this.categoryDAO.list());
		model.addAttribute("supplierList", this.supplierDAO.list());*/
		model.addAttribute("isAdminClickedProducts", "true");
		log.debug("Ending of the method listProducts");
		return "/Home";
	}

	// For add and update product both
	@RequestMapping(value = "/manage_product_add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product,
			 @RequestParam("image") MultipartFile file, Model model) {
	
		
		log.debug("Starting of the method addProduct");
		Category category = categoryDAO.getCategoryByName(product.getCategory().getName());
		// categoryDAO.saveOrUpdate(category); // why to save??

		Supplier supplier = supplierDAO.getSupplierByName(product.getSupplier().getName());
		// supplierDAO.saveOrUpdate(supplier); // Why to save??

		product.setCategory(category);
		product.setSupplier(supplier);

		product.setCategory_id(category.getId());
		product.setSupplier_id(supplier.getId());
		product.setId(Util.removeComman(product.getId()));
		productDAO.saveOrUpdate(product);

		FileUtil.upload(path, file, product.getId() + ".PNG");
		log.debug("Ending of the method addProduct");
		model.addAttribute("isAdminClickedProducts", "true");
		model.addAttribute("productList", this.productDAO.list());
		model.addAttribute("product", new Product());
		model.addAttribute("categoryList", this.categoryDAO.list());
		model.addAttribute("category", new Category());
		
		return "/Home";
		// return "redirect:/uploadFile";

	}

	@RequestMapping("manage_product_delete/{id}")
	public String removeProduct(@PathVariable("id") String id, ModelMap model) throws Exception {
		log.debug("Starting of the method deleteProduct");
		try {
			productDAO.delete(id);
			model.addAttribute("message", "Successfully deleted");
		} catch (Exception e) {
			model.addAttribute("message", e.getMessage());
			e.printStackTrace();
		}
		log.debug("Ending of the method deleteProduct");
		return "forward:/manage_products";
	}

	@RequestMapping("manage_product_edit/{id}")
	public String editProduct(@PathVariable("id") String id, Model model) {
		//categoryDAO.saveOrUpdate(category);
		log.debug(" Starting of the method editProduct");
		
		product = productDAO.getProductById(id);
		model.addAttribute("selectedProduct", product);
		log.debug(" End of the method editProduct");
		return "forward:/manage_products";
	}

	// Get select product details
	@RequestMapping("manage_product_get/{id}")
	public ModelAndView getSelectedProduct(@PathVariable("id") String id, RedirectAttributes redirectAttributes) {
		log.debug("Starting of the method getSelectedProduct");
		ModelAndView mv = new ModelAndView("redirect:/");
		redirectAttributes.addFlashAttribute("selectedProduct",  productDAO.getProductById(id));
		log.debug("Ending of the method getSelectedProduct");
		return mv;

	}

	

}
