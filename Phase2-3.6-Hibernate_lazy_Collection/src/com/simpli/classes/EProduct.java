package com.simpli.classes;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Entity;

@Entity
@Table(name="eproduct_10032022")
public class EProduct {
	@Id
	@GeneratedValue
	@Column(name="employee_id")
	private int id;

	@Column(name="eproduct_name")
	private String name;

	@Column(name="eproduct_price")
	private Double price;
	
	@Column(name="eproduct_color")
	private String color;
	
	@Column(name="eproduct_OS")
	private String OS;



	// ALT +S+R
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	//
	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}
	//
	public String getOS() {
		return OS;
	}

	public void setOS(String OS) {
		this.OS = OS;
	}  
}
