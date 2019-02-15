package com.eksad.pos.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eksad.pos.model.CategoryModel;
import com.eksad.pos.model.PackageModel;
import com.eksad.pos.service.PackageService;

@Controller
public class PackageController {

	private Log log = LogFactory.getLog(getClass()); 
	
	@Autowired
	private PackageService service;
	
	@RequestMapping(value="/package", method=RequestMethod.GET)
	public String index(Model model) {
		List<PackageModel> items = this.service.getList();
		
		model.addAttribute("dataList", items);
		
		return "package/index";
	}
	
	@RequestMapping(value="/package/detail", method=RequestMethod.GET)
	public String detail(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		// load data => memanggil data, lewat metod getById, param id
		PackageModel anu = this.service.getById(id);
		//mengirim data dari controller ke view
		model.addAttribute("dataItem", anu);
		
		return "package/detail";
	}
	
	@RequestMapping(value="/package/create", method = RequestMethod.GET)
	public String create() {
		return "package/create";
	}
	
	@RequestMapping(value="/package/insert", method = RequestMethod.POST)
	public String insert(Model model, @ModelAttribute PackageModel item) {
		this.service.insert(item);
		model.addAttribute("data", item);
		return "redirect:/package";
	}
	
	@RequestMapping(value="/package/edit", method = RequestMethod.GET)
	public String edit(Model mdl, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		// load data => memanggil data, lewat method getById, param id
		PackageModel pcm = this.service.getById(id);
		// mengirim data dari controller ke view
		mdl.addAttribute("dataItem2", pcm);
		return "package/edit";
	}
	
	@RequestMapping(value="/package/update", method = RequestMethod.POST)
	public String update(Model model, @ModelAttribute PackageModel item) {
		this.service.update(item);	
		model.addAttribute("data", item);
		return "redirect:/package";
	}
	
	@RequestMapping(value="/package/delete", method = RequestMethod.GET)
	public String delete(Model mdl, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		// load data => memanggil data, lewat method getById, param id
		PackageModel jtm = this.service.getById(id);
		// mengirim data dari controller ke view
		mdl.addAttribute("dataItem3", jtm);
		return "package/delete";
	}
	
	@RequestMapping(value="/package/remove", method = RequestMethod.POST)
	public String remove(Model model, @ModelAttribute PackageModel item) {
		this.service.delete(item);	
		model.addAttribute("data", item);
		return "redirect:/package";
	}
	
}
