package com.eksad.pos.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eksad.pos.service.SupplierService;

@Controller
public class SupplierController {

	private Log log = LogFactory.getLog(getClass()); 
	
	@Autowired
	private SupplierService service;
	
	@RequestMapping(value="/supplier")
	public String index() {
		return "supplier/index";
	}
	
	@RequestMapping(value="/supplier/detail")
	public String detail(){
		return "/supplier/detail";
}
	
	@RequestMapping(value="/supplier/create")
	public String create() {
		return "supplier/create";
	}
	
	@RequestMapping(value="/supplier/edit")
	public String edit() {
		return "supplier/edit";
	}
	
	@RequestMapping(value="/supplier/delete")
	public String delete(){
		return "/supplier/delete";
	}
}
