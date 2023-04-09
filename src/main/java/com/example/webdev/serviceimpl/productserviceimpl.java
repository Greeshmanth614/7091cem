package com.example.webdev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webdev.DaoImp.productdaoimpl;
import com.example.webdev.Service.productservice;
import com.example.webdev.bean.Product;
import com.example.webdev.dao.DaoLayer;
import com.example.webdev.dao.productDao;

@Service
public class productserviceimpl implements productservice{


	    @Autowired
	    private productDao userDao;


	    
	    @Override
	    public List<Product> findAll() {
	        return userDao.findAll();
	    }

	    @Override
	    public void save(Product user) {
	        userDao.save(user);
	    }

	    @Override
	    public void update(Product user) {
	        userDao.update(user);
	    }

	    @Override
	    public void delete(int id) {
	        userDao.delete(id);
	    }

		@Override
		public Product findById(long id) {
			return userDao.findById(id);
		}
		 
		
		@Override
		public void updateProduct(Long productId, Integer newQuantity) {
			Product product = userDao.findById(productId);
	        product.setQuantity(newQuantity);
	        userDao.updateProduct(product);
			
		}
	
	}
	
