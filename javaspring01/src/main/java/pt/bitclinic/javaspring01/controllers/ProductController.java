package pt.bitclinic.javaspring01.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.bitclinic.javaspring01.entities.Product;
import pt.bitclinic.javaspring01.repositories.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/")
	public String home() {

		return "Home page";
	}

	@GetMapping("/products")
	public List <Product> getObjects() 
	{
		
		/*
		 * Hard code insert
		 * 
		 * List <Product> products = new ArrayList <> ();
		 * 
		 * Department d1 = new Department(1L,"Tech");
		Department d2 = new Department(2L, "Pet");
		
		Product p1 = new Product(1L, "Macbook pro", 2200.0, d1);
		Product p2 = new Product(2L, "Pc Gamer", 3000.0, d1);
		Product p3 = new Product(3L, "Pet House", 330.0, d2);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		*/
		
		//using JpaRepository to retrieve data from database
		List <Product> products = productRepository.findAll();
		
		return products;

	}

}
