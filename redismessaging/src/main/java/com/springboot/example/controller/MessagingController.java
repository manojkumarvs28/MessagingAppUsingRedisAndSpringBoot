package com.springboot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.example.model.Product;
import com.springboot.example.repository.ProductDao;

@RestController
@RequestMapping("redis")
public class MessagingController {
	
	private ProductDao dao;
	
	public MessagingController(ProductDao dao) {
		this.dao = dao;
	}
	
	@PostMapping("/save")
	public Product save(@RequestBody Product product) {
		return dao.save(product);
	}
	
	@GetMapping
	public List<Object> getAllProducts() {
		return dao.findAll();
	}
	
	@GetMapping("/{id}")
	public Product getAllProducts(@PathVariable int id) {
		return dao.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public String remove(@PathVariable int id) {
		return dao.deleteProduct(id);
	}

}
