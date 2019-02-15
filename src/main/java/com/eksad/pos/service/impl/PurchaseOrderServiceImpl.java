package com.eksad.pos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eksad.pos.dao.PurchaseOrderDao;
import com.eksad.pos.model.PurchaseOrderModel;
import com.eksad.pos.service.PurchaseOrderService;

@Service
@Transactional
public class PurchaseOrderServiceImpl implements PurchaseOrderService {
	
	@Autowired
	private PurchaseOrderDao dao;
	
	@Override
	public List<PurchaseOrderModel> getList() {
		return this.dao.getList();
	}

	@Override
	public List<PurchaseOrderModel> search(String key) {
		return this.dao.search(key);
	}
	
	@Override
	public PurchaseOrderModel getById(Integer id) {
		return this.dao.getById(id);
	}

	@Override
	public void insert(PurchaseOrderModel model) {
		this.dao.insert(model);
		
	}

	@Override
	public void update(PurchaseOrderModel model) {
		this.dao.update(model);
		
	}

	@Override
	public void delete(PurchaseOrderModel model) {
		this.dao.delete(model);
		
	}

}
