package com.newproject;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown =true)
public class MasterDetails {

	public MasterDetails() {
		// TODO Auto-generated constructor stub
	}
	private String name;
}
