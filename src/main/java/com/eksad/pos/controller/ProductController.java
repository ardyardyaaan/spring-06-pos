package com.eksad.pos.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eksad.pos.model.CategoryModel;
import com.eksad.pos.model.PackageModel;
import com.eksad.pos.model.ProductModel;
import com.eksad.pos.service.CategoryService;
import com.eksad.pos.service.PackageService;
import com.eksad.pos.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService service;
	
	@Autowired
	private PackageService service2;
	
	@Autowired
	private CategoryService service3;
	
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public String index(Model model) {
		List<ProductModel> items = this.service.getList();
		
		model.addAttribute("dataList", items);
		
		return "product/index";
	}
	
	@RequestMapping(value="/product/detail", method=RequestMethod.GET)
	public String detail(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		// load data => memanggil data, lewat metod getById, param id
		ProductModel anu = this.service.getById(id);
		//mengirim data dari controller ke view
		model.addAttribute("dataItem", anu);
		
		return "product/detail";
	}
	
	@RequestMapping(value="/product/create", method = RequestMethod.GET)
	public String create(Model model) {
		List<PackageModel> items = new ArrayList<PackageModel>();
		items = this.service2.getList();
		model.addAttribute("dataPackage", items);
		
		List<CategoryModel> items2 = new ArrayList<CategoryModel>();
		items2 = this.service3.getList();
		model.addAttribute("dataCategory", items2);
		
		return "product/create";
	}
	
	@RequestMapping(value="/product/insert", method = RequestMethod.POST)
	public String insert(Model model, @ModelAttribute ProductModel item) {
		this.service.insert(item);
		model.addAttribute("data", item);
		return "redirect:/product";
	}
	
	@RequestMapping(value="/product/edit", method = RequestMethod.GET)
	public String edit(Model mdl, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		ProductModel ctm = this.service.getById(id);
		mdl.addAttribute("dataItem2", ctm);
		
		List<PackageModel> items = new ArrayList<PackageModel>();
		items = this.service2.getList();
		mdl.addAttribute("dataPackage", items);
		
		List<CategoryModel> items2 = new ArrayList<CategoryModel>();
		items2 = this.service3.getList();
		mdl.addAttribute("dataCategory", items2);
		return "product/edit";
	}
	
	@RequestMapping(value="/product/update", method = RequestMethod.POST)
	public String update(Model model, @ModelAttribute ProductModel item) {
		this.service.update(item);	
		model.addAttribute("data", item);
		return "redirect:/product";
	}
	
	@RequestMapping(value="/product/delete", method = RequestMethod.GET)
	public String delete(Model mdl, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		// load data => memanggil data, lewat method getById, param id
		ProductModel jtm = this.service.getById(id);
		// mengirim data dari controller ke view
		mdl.addAttribute("dataItem3", jtm);
		return "product/delete";
	}
	
	@RequestMapping(value="/product/remove", method = RequestMethod.POST)
	public String remove(Model model, @ModelAttribute ProductModel item) {
		this.service.delete(item);	
		model.addAttribute("data", item);
		return "redirect:/product";
	}
}
