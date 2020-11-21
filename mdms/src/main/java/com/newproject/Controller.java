package com.newproject;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	@GetMapping("/data")

	public Object[] run(@RequestBody ReqData req) throws Exception {
		{
			RestTemplate restTemplate = new RestTemplate();

			final RestData data = restTemplate.postForObject(
					"https://egov-micro-dev.egovernments.org/egov-mdms-service/v1/_search", req, RestData.class);
			// data.getMdmsres().getCom().getDepartment();
			return (data.getMdmsres().getCom().getDepartment().toArray());

		}
	}
	

}
