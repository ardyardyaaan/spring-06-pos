package com.eksad.pos.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eksad.pos.service.ProductService;

@Controller
public class ProductController {

	private Log log = LogFactory.getLog(getClass()); 
	
	@Autowired
	private ProductService service;
	
	@RequestMapping(value="/product")
	public String index() {
		return "product/index";
	}
	
	@RequestMapping(value="/product/detail")
	public String detail(){
		return "/product/detail";
}
	
	@RequestMapping(value="/product/create")
	public String create() {
		return "product/create";
	}
	
	@RequestMapping(value="/product/edit")
	public String edit() {
		return "product/edit";
	}
	
	@RequestMapping(value="/product/delete")
	public String delete(){
		return "/product/delete";
	}
}
