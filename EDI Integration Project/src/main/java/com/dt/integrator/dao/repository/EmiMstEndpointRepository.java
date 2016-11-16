package com.dt.integrator.dao.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dt.integrator.dao.entity.EmiMstEndpoint;
@Transactional
@Repository
public interface  EmiMstEndpointRepository extends JpaRepository<EmiMstEndpoint, Long> {

	 public List<EmiMstEndpoint> findByName(String name);
	 
}