package com.newproject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class MdmsApplication {
	private static final Logger log = LoggerFactory.getLogger(MdmsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MdmsApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {

		return args -> {
			JSONParser parser = new JSONParser();
			try {
			
				Object obj = parser.parse(new FileReader("C:\\Users\\Saumya\\Desktop\\spring\\mdms\\src\\main\\java\\com\\newproject\\req.json"));
			 
			
			JSONObject jsonObject = (JSONObject) obj;
 
			final RestData data  = restTemplate.postForObject("https://egov-micro-dev.egovernments.org/egov-mdms-service/v1/_search", jsonObject,RestData.class);
			
			log.info(data.toString());
			
//		RestData data = restTemplate.getForObject(
//					"https://egov-micro-dev.egovernments.org/egov-mdms-service/v1/_search", RestData.class);
//	log.info(data.toString());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		};
	}
	

}
