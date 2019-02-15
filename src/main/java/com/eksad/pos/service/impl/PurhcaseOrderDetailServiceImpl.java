package com.eksad.pos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eksad.pos.dao.PurchaseOrderDetailDao;
import com.eksad.pos.model.PurchaseOrderDetailModel;
import com.eksad.pos.service.PurchaseOrderDetailService;

@Service
@Transactional
public class PurhcaseOrderDetailServiceImpl implements PurchaseOrderDetailService {
	
	@Autowired
	private PurchaseOrderDetailDao dao;
	
	@Override
	public List<PurchaseOrderDetailModel> getList() {
		return this.dao.getList();
	}

	@Override
	public List<PurchaseOrderDetailModel> search(String key) {
		return this.dao.search(key);
	}
	
	@Override
	public PurchaseOrderDetailModel getById(Integer id) {
		return this.dao.getById(id);
	}

	@Override
	public void insert(PurchaseOrderDetailModel model) {
		this.dao.insert(model);
		
	}

	@Override
	public void update(PurchaseOrderDetailModel model) {
		this.dao.update(model);
		
	}

	@Override
	public void delete(PurchaseOrderDetailModel model) {
		this.dao.delete(model);
		
	}

}
