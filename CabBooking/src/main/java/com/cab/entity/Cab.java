package com.cab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cab {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cabId;
	private String location;
	private Integer price;
	private boolean isBooked;
	public Integer getCabId() {
		return cabId;
	}
	public void setCabId(Integer cabId) {
		this.cabId = cabId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	@Override
	public String toString() {
		return "Cab [cabId=" + cabId + ", location=" + location + ", price=" + price + ", isBooked=" + isBooked + "]";
	}
	public Cab(Integer cabId, String location, Integer price, boolean isBooked) {
		super();
		this.cabId = cabId;
		this.location = location;
		this.price = price;
		this.isBooked = isBooked;
	}
	public Cab() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
