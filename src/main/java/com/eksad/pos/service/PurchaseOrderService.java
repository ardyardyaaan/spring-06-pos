package com.eksad.pos.service;

import java.util.List;

import com.eksad.pos.model.PurchaseOrderModel;

public interface PurchaseOrderService {
	
	public List<PurchaseOrderModel> getList();
	public List<PurchaseOrderModel> search(String key);
	public PurchaseOrderModel getById(Integer id);
	public void insert(PurchaseOrderModel model);
	public void update(PurchaseOrderModel model);
	public void delete(PurchaseOrderModel model);
	
}
