package com.eksad.pos.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eksad.pos.service.CategoryService;

@Controller
public class CategoryController {

	private Log log = LogFactory.getLog(getClass()); 
	
	@Autowired
	private CategoryService service;
	
	@RequestMapping(value="/category")
	public String index() {
		return "category/index";
	}
	
	@RequestMapping(value="/category/detail")
	public String detail(){
		return "/category/detail";
}
	
	@RequestMapping(value="/category/create")
	public String create() {
		return "category/create";
	}
	
	@RequestMapping(value="/category/edit")
	public String edit() {
		return "category/edit";
	}
	
	@RequestMapping(value="/category/delete")
	public String delete(){
		return "/category/delete";
	}
}
