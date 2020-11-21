package com.newproject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown =true)
public class Departments {
	@JsonProperty("name")
	String name;
	@JsonProperty("code")
	String code;
	@JsonProperty("active")
	Boolean active;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public Departments() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Departments [name=" + name + ", code=" + code + ", active=" + active + "]";
	}


}
