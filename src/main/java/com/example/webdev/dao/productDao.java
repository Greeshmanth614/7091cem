package com.example.webdev.dao;

import java.util.List;


import com.example.webdev.bean.Product;

public interface productDao {
	
	Product findById(long id);

    List<Product> findAll();

    void save(Product user);

    void update(Product user);

    void delete(int id);
    

    void updateProduct(Product product);

	




}
