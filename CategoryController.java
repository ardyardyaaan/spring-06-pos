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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eksad.pos.model.CategoryModel;
import com.eksad.pos.service.CategoryService;

@Controller
public class CategoryController {

	private Log log = LogFactory.getLog(getClass()); 
	
	@Autowired
	private CategoryService service;
	
	@RequestMapping(value="/category", method=RequestMethod.GET)
	public String index(Model model) {
		List<CategoryModel> items = this.service.getList();
		
		model.addAttribute("dataList", items);
		
		return "category/index";
	}
	
	@RequestMapping(value="/category/detail", method=RequestMethod.GET)
	public String detail(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		// load data => memanggil data, lewat metod getById, param id
		CategoryModel anu = this.service.getById(id);
		//mengirim data dari controller ke view
		model.addAttribute("dataItem", anu);
		
		return "category/detail";
	}
	
	@RequestMapping(value="/category/create", method = RequestMethod.GET)
	public String create() {
		return "category/create";
	}
	
	@RequestMapping(value="/category/insert", method = RequestMethod.POST)
	public String insert(Model model, @ModelAttribute CategoryModel item) {
		this.service.insert(item);
		model.addAttribute("data", item);
		return "redirect:/category";
	}
	
	@RequestMapping(value="/category/edit", method = RequestMethod.GET)
	public String edit(Model mdl, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		// load data => memanggil data, lewat method getById, param id
		CategoryModel ctm = this.service.getById(id);
		// mengirim data dari controller ke view
		mdl.addAttribute("dataItem2", ctm);
		return "category/edit";
	}
	
	@RequestMapping(value="/category/update", method = RequestMethod.POST)
	public String update(Model model, @ModelAttribute CategoryModel item) {
		this.service.update(item);	
		model.addAttribute("data", item);
		return "redirect:/category";
	}
	
	@RequestMapping(value="/category/delete", method = RequestMethod.GET)
	public String delete(Model mdl, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("id"));
		// load data => memanggil data, lewat method getById, param id
		CategoryModel jtm = this.service.getById(id);
		// mengirim data dari controller ke view
		mdl.addAttribute("dataItem3", jtm);
		return "category/delete";
	}
	
	@RequestMapping(value="/category/remove", method = RequestMethod.POST)
	public String remove(Model model, @ModelAttribute CategoryModel item) {
		this.service.delete(item);	
		model.addAttribute("data", item);
		return "redirect:/category";
	}
	
	@RequestMapping(value="/api/category/list", method=RequestMethod.GET)
	public ResponseEntity<List<CategoryModel>> list(){
		ResponseEntity<List<CategoryModel>> result = null;
		try {
			List<CategoryModel> list = this.service.getList();
			result = new ResponseEntity<List<CategoryModel>>(list, HttpStatus.OK);
		} catch (Exception e) {
			log.debug(e.getMessage(),e);
			result = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}		
		return result;
	}
	
	@RequestMapping(value="/api/category/search/{katakunci}", method=RequestMethod.GET)
	public ResponseEntity<List<CategoryModel>> search(@PathVariable("katakunci") String cari) {
		ResponseEntity<List<CategoryModel>> result = null;
		try {
			List<CategoryModel> list = this.service.search(cari);
			result = new ResponseEntity<List<CategoryModel>>(list,HttpStatus.OK);
		} catch (Exception err) {
			log.debug(err.getMessage(),err);
			result = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return result;
	}
	
	@RequestMapping(value="/api/category/get/{catId}", method=RequestMethod.GET)
	public ResponseEntity<CategoryModel> getById(@PathVariable("catId") int vId) {
		ResponseEntity<CategoryModel> result = null;
		try {
			CategoryModel cat = this.service.getById(vId);
			result = new ResponseEntity<CategoryModel>(cat,HttpStatus.OK);
		} catch (Exception e) {
			log.debug(e.getMessage(), e);
			result = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return result;
	}
	
	@RequestMapping(value="api/category", method=RequestMethod.POST)
	public ResponseEntity<CategoryModel> postInsert(@RequestBody CategoryModel item) {
		ResponseEntity<CategoryModel> result = null;
		try {
			this.service.insert(item);
			result = new ResponseEntity<CategoryModel>(item, HttpStatus.CREATED);
		} catch (Exception e) {
			log.debug(e.getMessage(), e);
			result = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return result;
	}
	
	@RequestMapping(value="api/category", method=RequestMethod.PUT)
	public ResponseEntity<CategoryModel> putUpdate(@RequestBody CategoryModel item) {
		ResponseEntity<CategoryModel> result = null;
		try {
			this.service.update(item);
			result = new ResponseEntity<CategoryModel>(item, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			log.debug(e.getMessage(), e);
			result = new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return result;
	}
}
