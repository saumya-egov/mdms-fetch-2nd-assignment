package com.newproject;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;



@JsonIgnoreProperties(ignoreUnknown =true)
@Data
public class Commonmasters {
	@JsonProperty("Department")
	private List<Departments> department;
	

	
	
	
}
