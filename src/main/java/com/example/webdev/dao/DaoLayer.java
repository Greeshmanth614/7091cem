package com.example.webdev.dao;

import java.util.List;

import com.example.webdev.bean.Product;
import com.example.webdev.bean.RegisterEntity;
import com.example.webdev.bean.UserEntity;

public interface DaoLayer {
	
    UserEntity getByEmail(String Email);
	
	int createNewUser(RegisterEntity register);


    boolean checkEmail(String email);

    void addOrder(String name, String email, String credit, String cvv, String expiry, float totalPrice);
}
