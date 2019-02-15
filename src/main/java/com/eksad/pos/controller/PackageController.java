package com.eksad.pos.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eksad.pos.service.PackageService;

@Controller
public class PackageController {

	private Log log = LogFactory.getLog(getClass()); 
	
	@Autowired
	private PackageService service;
	
	@RequestMapping(value="/package")
	public String index() {
		return "package/index";
	}
	
	@RequestMapping(value="/package/detail")
	public String detail(){
		return "/package/detail";
}
	
	@RequestMapping(value="/package/create")
	public String create() {
		return "package/create";
	}
	
	@RequestMapping(value="/package/edit")
	public String edit() {
		return "package/edit";
	}
	
	@RequestMapping(value="/package/delete")
	public String delete(){
		return "/package/delete";
	}
}
