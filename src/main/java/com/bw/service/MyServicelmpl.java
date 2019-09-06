package com.bw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.mapper.MyMapperDao;

@Service
public class MyServicelmpl implements MyService{

	@Autowired
	private MyMapperDao myMapperDao;
	
	
}
