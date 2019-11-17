package com.example.demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Details about the student")
public class Student {
    
	@ApiModelProperty(notes ="this is unique id of the student")
	private String id;
	@ApiModelProperty(notes = "the persion's name")
	private String name;
	@ApiModelProperty(notes = "the persion's address")
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
