package com.maven.bean;

import java.util.Date;

/** 
 * TODO:类功能介绍
 * @version 2019年6月29日下午12:29:04
 * @author yangzaihua
 */
public class Item {

	// 鍟嗗搧id
	private int id;
	// 鍟嗗搧鍚嶇О
	private String name;
	// 鍟嗗搧浠锋牸
	private double price;
	// 鍟嗗搧鍒涘缓鏃堕棿
	private Date createtime;
	// 鍟嗗搧鎻忚堪
	private String detail;
	
	public Item(int id, String name, double price, Date createtime, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.createtime = createtime;
		this.detail = detail;
	}
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", createtime=" + createtime + ", detail="
				+ detail + "]";
	}
	
}
