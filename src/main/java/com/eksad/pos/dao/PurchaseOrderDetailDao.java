package com.eksad.pos.dao;

import java.util.List;

import com.eksad.pos.model.PurchaseOrderDetailModel;

public interface PurchaseOrderDetailDao {
	
	public List<PurchaseOrderDetailModel> getList();
	public List<PurchaseOrderDetailModel> search(String key);
	public PurchaseOrderDetailModel getById(Integer id);
	public void insert(PurchaseOrderDetailModel model);
	public void update(PurchaseOrderDetailModel model);
	public void delete(PurchaseOrderDetailModel model);
	
}
