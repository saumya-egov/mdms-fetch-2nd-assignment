package com.newproject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@JsonIgnoreProperties(ignoreUnknown =true)
@Data
public class RestData {

	
	
	
	
	@JsonProperty("ResponseInfo")
	private String responseInfo;
	@JsonProperty("MdmsRes")
	private MdmsRes mdmsres;
	
	

}
