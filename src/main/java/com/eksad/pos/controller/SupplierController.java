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

import com.eksad.pos.model.PackageModel;
import com.eksad.pos.model.SupplierModel;
import com.eksad.pos.service.SupplierService;

@Controller
public class SupplierController {

	private Log log = LogFactory.getLog(getClass()); 
	
	@Autowired
	private SupplierService service;
	
	@RequestMapping(value="/supplier", method=RequestMethod.GET)
	public String index(Model model) {
		List<SupplierModel> items = this.service.getList();
		
		model.addAttribute("dataList", items);
		
		return "supplier/index";
	}
	
	@RequestMapping(value="/supplier/detail", method=RequestMethod.GET)
	public String detail(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		// load data => memanggil data, lewat metod getById, param id
		SupplierModel anu = this.service.getById(id);
		//mengirim data dari controller ke view
		model.addAttribute("dataItem", anu);
		
		return "supplier/detail";
	}
	
	@RequestMapping(value="/supplier/create", method = RequestMethod.GET)
	public String create() {
		return "supplier/create";
	}
	
	@RequestMapping(value="/supplier/insert", method = RequestMethod.POST)
	public String insert(Model model, @ModelAttribute SupplierModel item) {
		this.service.insert(item);
		model.addAttribute("data", item);
		return "redirect:/supplier";
	}
	
	@RequestMapping(value="/supplier/edit", method = RequestMethod.GET)
	public String edit(Model mdl, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		// load data => memanggil data, lewat method getById, param id
		SupplierModel ctm = this.service.getById(id);
		// mengirim data dari controller ke view
		mdl.addAttribute("dataItem2", ctm);
		return "supplier/edit";
	}
	
	@RequestMapping(value="/supplier/update", method = RequestMethod.POST)
	public String update(Model model, @ModelAttribute SupplierModel item) {
		this.service.update(item);	
		model.addAttribute("data", item);
		return "redirect:/supplier";
	}
	
	@RequestMapping(value="/supplier/delete", method = RequestMethod.GET)
	public String delete(Model mdl, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		// load data => memanggil data, lewat method getById, param id
		SupplierModel jtm = this.service.getById(id);
		// mengirim data dari controller ke view
		mdl.addAttribute("dataItem3", jtm);
		return "supplier/delete";
	}
	
	@RequestMapping(value="/supplier/remove", method = RequestMethod.POST)
	public String remove(Model model, @ModelAttribute SupplierModel item) {
		this.service.delete(item);	
		model.addAttribute("data", item);
		return "redirect:/supplier";
	}
	
}
