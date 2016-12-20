package com.dt.integrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dt.integrator.service.EndpointService;

@SpringBootApplication
public class EdiIntegrationProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EdiIntegrationProjectApplication.class, args);
	//	EndpointService client =(EndpointService) ctx.getBean(EndpointService.class);
		//client.getNames();
		//SpringApplication.run(EdiIntegrationProjectApplication.class, args);
		
	}
}
