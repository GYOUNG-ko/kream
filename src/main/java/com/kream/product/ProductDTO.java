package com.kream.product;

import java.util.Date;

public class ProductDTO {
	private int productId;
	private String category1;
	private String category2;
	private String brand;
	private String nameKr;
	private String nameEn;
	private String content;
	private int firstPrice;
	private Date releaseDay;
	private Date registDay;
	private String color;
	private String size;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getCategory1() {
		return category1;
	}
	public void setCategory1(String category1) {
		this.category1 = category1;
	}
	public String getCategory2() {
		return category2;
	}
	public void setCategory2(String category2) {
		this.category2 = category2;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getNameKr() {
		return nameKr;
	}
	public void setNameKr(String nameKr) {
		this.nameKr = nameKr;
	}
	public String getNameEn() {
		return nameEn;
	}
	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getFirstPrice() {
		return firstPrice;
	}
	public void setFirstPrice(int firstPrice) {
		this.firstPrice = firstPrice;
	}
	public Date getReleaseDay() {
		return releaseDay;
	}
	public void setReleaseDay(Date releaseDay) {
		this.releaseDay = releaseDay;
	}
	public Date getRegistDay() {
		return registDay;
	}
	public void setRegistDay(Date registDay) {
		this.registDay = registDay;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
}
