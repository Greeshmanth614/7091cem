package com.example.webdev.Service;

import java.util.List;

import com.example.webdev.bean.Product;
import com.example.webdev.bean.RegisterEntity;
import com.example.webdev.bean.UserEntity;

public interface services {
	
    UserEntity GetUserByEmail(String Email);
	
	int createNewUser(RegisterEntity user);


    boolean checkEmail(String email);

    void addOrder(String name, String email, String credit, String cvv, String expiry, float totalPrice);
}
