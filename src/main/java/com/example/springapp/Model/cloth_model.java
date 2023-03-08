package com.example.springapp.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="cloth")
public class cloth_model {

	@Id
	private int cid;
	private String brand;
	private String name;
	private float price;
	private float rating;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	public cloth_model(int cid, String brand,String name,float price,float rating) {
		super();
		this.cid=cid;
		this.brand=brand;
		this.name=name;
		this.price=price;
		this.rating=rating;
	}
	public cloth_model() {
		
	}
	@Override
	public String toString() {
		return "cloth_model [bid=" + cid + ", name=" + name + ", brand=" + brand + ", price=" + price +", rating=" + rating + "]";
	}
}