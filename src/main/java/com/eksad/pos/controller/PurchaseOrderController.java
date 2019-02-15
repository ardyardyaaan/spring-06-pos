package com.eksad.pos.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eksad.pos.model.PurchaseOrderModel;
import com.eksad.pos.service.PurchaseOrderService;

@Controller
public class PurchaseOrderController {

	@Autowired
	private PurchaseOrderService service;
	
	@RequestMapping(value="/purchaseorder", method=RequestMethod.GET)
	public String index(Model model) {
		List<PurchaseOrderModel> items = this.service.getList();
		
		model.addAttribute("dataList", items);
		
		return "purchaseorder/index";
	}
	
	@RequestMapping(value="/purchaseorder/detail", method=RequestMethod.GET)
	public String detail(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		// load data => memanggil data, lewat metod getById, param id
		PurchaseOrderModel anu = this.service.getById(id);
		//mengirim data dari controller ke view
		model.addAttribute("dataItem", anu);
		
		return "purchaseorder/detail";
	}
	
	@RequestMapping(value="/purchaseorder/create", method = RequestMethod.GET)
	public String create() {
		return "purchaseorder/create";
	}
	
	@RequestMapping(value="/purchaseorder/insert", method = RequestMethod.POST)
	public String insert(Model model, @ModelAttribute PurchaseOrderModel item) {
		this.service.insert(item);
		model.addAttribute("data", item);
		return "redirect:/purchaseorder";
	}
	
	@RequestMapping(value="/purchaseorder/edit", method = RequestMethod.GET)
	public String edit(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		PurchaseOrderModel po = this.service.getById(id);
		model.addAttribute("dataItem2", po);
		return "purchaseorder/edit";
	}
	
	@RequestMapping(value="/purchaseorder/update", method = RequestMethod.POST)
	public String update(Model model, @ModelAttribute PurchaseOrderModel item) {
		this.service.update(item);	
		model.addAttribute("data", item);
		return "redirect:/purchaseorder";
	}
	
	@RequestMapping(value="/purchaseorder/delete", method = RequestMethod.GET)
	public String delete(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		// load data => memanggil data, lewat method getById, param id
		PurchaseOrderModel po = this.service.getById(id);
		// mengirim data dari controller ke view
		model.addAttribute("dataItem3", po);
		return "purchaseorder/delete";
	}
	
	@RequestMapping(value="/purchaseorder/remove", method = RequestMethod.POST)
	public String remove(Model model, @ModelAttribute PurchaseOrderModel item) {
		this.service.delete(item);	
		model.addAttribute("data", item);
		return "redirect:/purchaseorder";
	}
}
