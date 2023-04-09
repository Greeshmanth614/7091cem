package com.example.webdev.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.webdev.bean.Product;
import com.example.webdev.bean.RegisterEntity;
import com.example.webdev.dao.DaoLayer;
import com.example.webdev.dao.productDao;

import jakarta.annotation.PostConstruct;

@Repository
public class productdaoimpl extends JdbcDaoSupport implements productDao {
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	private void intilize() {
		setDataSource(dataSource);
	}
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	    
	    @Override
	    public List<Product> findAll() {
	        List<Product> productList = new ArrayList<>();
	        try (Connection conn = dataSource.getConnection();
	             PreparedStatement ps = conn.prepareStatement("SELECT * FROM products")) {
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                Product product = new Product();
	                product.setId(rs.getInt("id"));
	                product.setName(rs.getString("name"));
	                product.setPrice(rs.getDouble("price"));
	                productList.add(product);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return productList;
	    }
	   
		    

	    @Override
	    public Product findById(long id) {
	        String sql = "SELECT * FROM product WHERE id=?";
	        return (Product) jdbcTemplate.queryForObject(sql, new Object[]{id}, new ColumnMapRowMapper());
	    }

	    

	    @Override
	    public void save(Product user) {
	        String sql = "INSERT INTO product (name, email) VALUES (?, ?)";
	        jdbcTemplate.update(sql, user.getName(), user.getPrice());
	    }

	     @Override
	    public void updateProduct(Product user) {
	        String sql = "UPDATE product SET name=?, email=? WHERE id=?";
	        jdbcTemplate.update(sql, user.getName(), user.getPrice(), user.getId());
	    }

	    @Override
	    public void delete(int id) {
	        String sql = "DELETE FROM product WHERE id=?";
	        jdbcTemplate.update(sql, id);
	    }

		 @Override
		    public void update(Product product) {
		        String sql = "UPDATE cart SET name = ?, price = ?, quantity = ? WHERE id = ?";
		        jdbcTemplate.update(sql, product.getName(), product.getPrice(), product.getQuantity(), product.getId());
		    }
		

}

