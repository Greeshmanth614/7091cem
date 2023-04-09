package com.example.webdev.Service;

import java.util.List;

import com.example.webdev.bean.Product;

public interface productservice {
	
	    Product findById(long id);

	    List<Product> findAll();

	    void save(Product user);

	    void update(Product user);

	    void delete(int id);
	    
	    void updateProduct(Long productId, Integer newQuantity);

	

}
