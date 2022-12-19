package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class clothes {
	@Id
	private Integer id;

	private String type;

	private String name;

	private String imgurl;

	private String price;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}


}
