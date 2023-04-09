package com.example.webdev.bean;

public class Cart {
	    private int id;
	    private double price;
	    private String image;
	    private String name;
	    private int quantity;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public Cart() {
			
		}
		
		public Cart(int id, double price, String image, String name, int quantity) {
			super();
			this.id = id;
			this.price = price;
			this.image = image;
			this.name = name;
			this.quantity = quantity;
		}
	
        
}

    


