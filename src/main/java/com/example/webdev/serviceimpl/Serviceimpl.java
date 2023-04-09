package com.example.webdev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webdev.Service.services;
import com.example.webdev.bean.Product;
import com.example.webdev.bean.RegisterEntity;
import com.example.webdev.bean.UserEntity;
import com.example.webdev.dao.DaoLayer;

@Service
public class Serviceimpl implements services {
	
	@Autowired
	DaoLayer dao;

	@Override
	public boolean checkEmail(String email) {
		return dao.checkEmail(email);
	}

	@Override
	public UserEntity GetUserByEmail(String Email) {
		UserEntity user = dao.getByEmail(Email);
		return user;
	}
	

	@Override
	public int createNewUser(RegisterEntity user) {
		return dao.createNewUser(user);
		
	}

	@Override
	public void addOrder(String name, String email, String credit, String cvv, String expiry, float totalPrice) {
		dao.addOrder(name, email, credit, cvv, expiry, totalPrice);
	}
	

}
