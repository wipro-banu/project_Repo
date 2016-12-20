package com.dt.integrator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dt.integrator.dao.entity.EmiMstEndpoint;
import com.dt.integrator.dao.entity.EmiMstProtocol;
import com.dt.integrator.dao.repository.EmiMstEndpointRepository;

@Component
public class EndpointService {

	  @Autowired
	  private EmiMstEndpointRepository emiMstEndpointRepository;
	  
	  public EndpointService(EmiMstEndpointRepository emiMstEndpointRepository) {
		super();
		this.emiMstEndpointRepository = emiMstEndpointRepository;
	}

	@Transactional(readOnly = true)
	  public void getNames() {
	    List<EmiMstEndpoint> endpoints = emiMstEndpointRepository.findByName("rajan");
	    EmiMstEndpoint endpoint = endpoints.get(0);
	    System.out.println(endpoint.getName());
	  }
	
	@Transactional(readOnly = false)
	  public void save() {
		EmiMstEndpoint emiMstEndpoint = new EmiMstEndpoint();
		emiMstEndpoint.setId(new Long("3456"));
		//emiMstEndpoint.setFrequency(new Long(345));
		EmiMstProtocol emiMstProtocol = new EmiMstProtocol();
		emiMstProtocol.setId(new Long(23));
		emiMstEndpoint.setEmiMstProtocol(emiMstProtocol);
		emiMstEndpointRepository.save(emiMstEndpoint);
	  }	
}
