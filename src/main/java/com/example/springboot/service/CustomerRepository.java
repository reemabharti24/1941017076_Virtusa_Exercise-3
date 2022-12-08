package com.example.springboot.service;

import java.util.List;

public record CustomerRepository() {
	Product product1 = new Product();
	product1.setName("")
	product.setManufacturer("");

	productRepository.save(product);

//update an existing record in product table
	Product product2 = productRepository.findOne(1L);
	product2.setName("");
	product.setManufacturer("");

	productRepository.save(product);

// delete an existing record from product table
	Product product3 = productRepository.findOne(1L);
	productRepository.delete(product);

//execute an query and return the manufacturer list for a given product name
	List<Product> products = productRepository.findByName("");

	for (Product product : products) {
	System.out.println(product1.getManufacturer());
	}

}
}
