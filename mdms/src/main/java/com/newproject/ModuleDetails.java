package com.newproject;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
@Data
@JsonIgnoreProperties(ignoreUnknown =true)
public class ModuleDetails {

	public ModuleDetails() {
		// TODO Auto-generated constructor stub
	}
	private String moduleName;
	private List<MasterDetails> masterDetails;

}
