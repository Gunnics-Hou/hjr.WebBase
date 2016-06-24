package com.hjr.domain;

/**
 * 领域类：书，封装ID、书名、价格、出版社、描述等基本信息。
 * @author houjingrui
 *
 */
public class Book {

	private Integer id;
	private String name;
	private double price;
	private String publishing;
	private String description;
	
	public Book() {
		super();
	}

	public Book(Integer id, String name, double price, String publishing, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.publishing = publishing;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
