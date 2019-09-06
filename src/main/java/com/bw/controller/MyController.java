package com.bw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.service.MyService;

@Controller
public class MyController {

	@Autowired
	private MyService myService;
	
	@RequestMapping("list.do")
	public String list() {
		
		
		return "list";
	}
}
